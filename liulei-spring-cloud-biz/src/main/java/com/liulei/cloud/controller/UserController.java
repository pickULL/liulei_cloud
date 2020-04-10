package com.liulei.cloud.controller;

import com.liulei.cloud.annotations.Sensitive;
import com.liulei.cloud.annotations.SensitiveInfo;
import com.liulei.cloud.entity.User;
import com.liulei.cloud.service.IUserService;
import com.liulei.cloud.utils.SensitiveInfoUtils;
import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liulei
 * @date 2020/3/25 17:25
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/getOne/{id}")
    @Sensitive
    public User getOne(@PathVariable("id") Long id) throws IllegalAccessException {
        User byId = userService.getById(id);
        //SensitiveInfoUtils.dealSensitiveInfo(byId);
       return byId;
    }

    @PostMapping("/freemarker")
    public void freemarker() throws Exception {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_20);
        ClassPathResource classPathResource = new ClassPathResource("/template");
        File file = classPathResource.getFile();
        configuration.setDirectoryForTemplateLoading(file);
        Template template = configuration.getTemplate("excelModel.xml","UTF-8");
        Map<String,Object> data = new HashMap<>();
        data.put("title","测试一下");
//        File docFile = new File("src/main/resources/data/1111.xlsx");

        template.process(data,new FileWriter("F:\\gitRepository_beifen\\liulei_cloud\\liulei-spring-cloud-biz\\src\\main\\resources\\data\\222.xlsx"));
        log.info("++++成功");
    }
}
