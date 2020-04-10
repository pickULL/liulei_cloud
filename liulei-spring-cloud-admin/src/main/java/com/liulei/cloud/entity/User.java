package com.liulei.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.liulei.cloud.annotations.SensitiveInfo;
import com.liulei.cloud.enums.SensitiveType;
import lombok.Data;

/**
 * @author liulei
 * @date 2019/12/3 11:35
 */
@TableName("t_user")
@Data
public class User {
    private Integer id;
    private String username;
    @SensitiveInfo(type = SensitiveType.CHINESE_NAME)
    private String nickname;
    private String password;
    private String salt;
    private String realname;
}
