package com.liulei.cloud.config;

import com.liulei.cloud.shiro.MyAuthRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.mgt.SecurityManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liulei
 * @date 2019/12/3 11:52
 */
@Configuration
public class ShiroConfig {
    @Value("${shiro.hashAlgorithmName}")
    private String hashAlgorithmName;

    @Value("${shiro.hashIterations}")
    private Integer hashIterations;

    /**
     * 获取凭证匹配器
     * @return
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
        matcher.setHashAlgorithmName(hashAlgorithmName);
        matcher.setHashIterations(hashIterations);
        return matcher;
    }

    /**
     * 获取自定义的Realm
     * @return
     */
    @Bean
    public MyAuthRealm myAuthRealm(){
        MyAuthRealm authRealm = new MyAuthRealm();
        authRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return authRealm;
    }

    /**
     * 获取SecurityManager对象
     * @return
     */
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(myAuthRealm());
        return manager;
    }

    /**
     * 注册ShiroFilterFactoryBean
     * @param manager
     * @return
     */
    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager manager){
        ShiroFilterFactoryBean filter = new ShiroFilterFactoryBean();
        filter.setSecurityManager(manager);
        filter.setLoginUrl("/login.do");
        filter.setSuccessUrl("/success.html");
        filter.setUnauthorizedUrl("/refuse.html");
        // 设置过滤器
        Map<String,String> map = new HashMap<>();
        map.put("/css/**","anon");
        map.put("/img/**","anon");
        map.put("/js/**","anon");
        map.put("/login","anon");
        map.put("/user/**","anon");
        map.put("/login.do","authc");
        map.put("/**","authc");
        filter.setFilterChainDefinitionMap(map);
        return filter;
    }

}
