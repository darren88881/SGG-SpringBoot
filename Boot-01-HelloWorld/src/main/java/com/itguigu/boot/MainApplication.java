package com.itguigu.boot;

import com.itguigu.boot.bean.Cat;
import com.itguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootConfiguration : 配置类
 * @EnableAutoConfiguration ：启用自动配置
 *      @AutoConfigurationPackage ：将指定包下的所有组件导入进来
 *      @Import                   ：给容器批量导入一些组件，按需自动装配
 * @ComponentScan           ：包扫描
 * @Author darren
 * @Date 2022/11/25 13:00
 */
@SpringBootApplication
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
