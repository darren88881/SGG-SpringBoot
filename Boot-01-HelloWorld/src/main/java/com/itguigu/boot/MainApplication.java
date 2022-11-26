package com.itguigu.boot;

import com.itguigu.boot.bean.Car;
import com.itguigu.boot.bean.Cat;
import com.itguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @EnableConfigurationProperties：开启属性配置功能，并配置到容器
 *
 * @Author darren
 * @Date 2022/11/25 13:00
 */
@SpringBootApplication
@EnableConfigurationProperties(Car.class)
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        Cat cat = run.getBean("cat", Cat.class);
        System.out.println(cat);

        User user01 = run.getBean("user01",User.class);
        System.out.println(user01);

        User userHaha = run.getBean("userHaha",User.class);
        System.out.println(userHaha);
    }
}
