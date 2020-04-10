package com.liulei.cloud.consumer.liuleispringcloudconsumer.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.config.SpringContextHolder;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.User;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.entity.UserModel;
import com.liulei.cloud.consumer.liuleispringcloudconsumer.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板的读取类
 *
 * @author Jiaju Zhuang
 */
@Component
public class UploadDataListener extends AnalysisEventListener<UserModel> {
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadDataListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    List<User> list = new ArrayList<>();

//    private IUserService userService;
//    public UploadDataListener(IUserService userService){
//        this.userService = userService;
//    }
//    @Autowired
//    private IUserService userService;

    @Override
    public void invoke(UserModel data, AnalysisContext context) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        User user = new User();
        BeanUtils.copyProperties(data,user);
        list.add(user);
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

        saveData();
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        IUserService userService = SpringContextHolder.getBean(IUserService.class);
        userService.saveBatch(list);
        LOGGER.info("存储数据库成功！");
    }


}
