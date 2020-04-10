package com.liulei.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liulei
 * @date 2019/12/3 14:57
 */
@Controller
public class BaseController {

    @RequestMapping("/{path}")
    public String page(@PathVariable String path){
        return path;
    }
}
