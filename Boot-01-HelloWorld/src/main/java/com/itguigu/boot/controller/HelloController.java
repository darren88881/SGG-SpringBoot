package com.itguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Author darren
 * @Date 2022/11/25 13:02
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "HelloWorld";
    }
}
