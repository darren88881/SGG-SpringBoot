package com.itguigu.boot.config;

import com.itguigu.boot.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类，类似 spring.xml 配置的Bean
 *
 * proxyBeanMethods : true 表示单例
 * @Author darren
 * @Date 2022/11/25 21:43
 */
@Configuration(proxyBeanMethods = true)
public class MyConfig {

    @Bean
    public Cat cat(){
        return new Cat("小花猫");
    }
}
