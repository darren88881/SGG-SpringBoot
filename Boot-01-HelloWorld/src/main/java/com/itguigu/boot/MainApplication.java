package com.itguigu.boot;

import com.itguigu.boot.bean.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @Author darren
 * @Date 2022/11/25 13:00
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        Cat cat = run.getBean("cat", Cat.class);
        System.out.println(cat);

    }
}
