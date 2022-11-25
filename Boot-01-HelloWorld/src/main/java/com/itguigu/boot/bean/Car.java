package com.itguigu.boot.bean;

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
public class Car {
    private String brand;
    private Integer price;

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(final Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
