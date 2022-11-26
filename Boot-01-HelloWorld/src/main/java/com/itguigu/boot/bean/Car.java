package com.itguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Component // 加入到容器中
 * @ConfigurationProperties:
 *     将配置文件中的配置的值赋上值
 *
 * @Author darren
 * @Date 2022/11/25 22:36
 */
@ConfigurationProperties(prefix = "mycar")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String brand;
    private Integer price;


}
