package com.itguigu.boot.config;

import com.itguigu.boot.bean.Cat;
import com.itguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 配置类，类似 spring.xml 配置的Bean
 * proxyBeanMethods : true 表示单例
 * @Author darren
 * @Date 2022/11/25 21:43
 */
@Import({ User.class})
@Configuration(proxyBeanMethods = false)
@ImportResource("classpath:bean.xml")
public class MyConfig {

    @Bean
    public Cat cat(){
        return new Cat("小花猫");
    }

    /**
     * ConditionalOnBean：
     *      条件装配，表示名为 cat 的对象存在则进行装配
     *      也可以装配在类上
     * @return
     */
    @Bean("user01")
    @ConditionalOnBean(name = "cat")
    public User user(Cat cat){
        User user = new User("张三", 18);
        user.setCat(cat);
        return user;
    }
}
