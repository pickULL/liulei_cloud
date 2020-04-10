package com.liulei.cloud.shiro;

import com.liulei.cloud.entity.User;
import com.liulei.cloud.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.SimpleByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liulei
 * @date 2019/12/3 11:48
 */
@Slf4j
public class MyAuthRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;
    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        String username = token.getUsername();
        log.info("开始登录认证："+username);
        List<User> list = userService.login(username);
        if(null == list || list.size() != 1){
            return null;
        }
        User user = list.get(0);
        return new SimpleAuthenticationInfo(user,user.getPassword(),new SimpleByteSource(user.getSalt()),"authcRealme");
    }
}
