package com.mmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: mmc
 * @create: 2020-12-20 00:25
 **/
@Controller
public class TestController {


    @RequestMapping("/index")
    @ResponseBody
    public String page(){
        return "hello jenkins";
    }
}
