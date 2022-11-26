package com.itguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Data                get\set方法
 * @ToString            toString 方法
 * @NoArgsConstructor   无参构造器
 * @AllArgsConstructor  有参构造器
 *
 * @Author darren
 * @Date 2022/11/25 21:41
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cat {
    private String name;

}
