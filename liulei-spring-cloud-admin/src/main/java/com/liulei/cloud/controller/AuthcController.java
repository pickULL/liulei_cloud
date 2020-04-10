package com.liulei.cloud.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liulei
 * @date 2019/12/3 15:34
 */
@Controller
public class AuthcController {

    @RequestMapping("/login.do")
    public String login(HttpServletRequest request){
        Object obj = request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
        System.out.println("认证的错误信息:" + obj);
        return "/login";
    }

    @RequestMapping("/login")
    public String logining(HttpServletRequest request){
        return "成功";
    }

    /**
     * 注销的方法
     * @return
     */
    @RequestMapping("/logout.do")
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "redirect:/login";
    }

//    public static void main(String[] args) {
//        Md5Hash md5Hash = new Md5Hash("1","abc",1024);
//        System.out.println(md5Hash);
//    }
}
