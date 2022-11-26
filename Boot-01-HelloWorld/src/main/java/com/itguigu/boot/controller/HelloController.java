package com.itguigu.boot.controller;

import com.itguigu.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Author darren
 * @Date 2022/11/25 13:02
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private Car car;

    @RequestMapping("/hello")
    public String handle01(){
        return "HelloWorld";
    }

    @RequestMapping("/car")
    public Car getCar(){
        log.info("汽车日志！");
        return car;
    }
}
