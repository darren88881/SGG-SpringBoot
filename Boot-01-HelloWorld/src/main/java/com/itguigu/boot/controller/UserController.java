package com.itguigu.boot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Author darren
 * @Date 2022/12/4 12:28
 */
@RestController
public class UserController {

    @GetMapping(value = "/user")
    public String getUser(){
        return "GET-USER";
    }

    @PutMapping(value = "/user")
    public String putUser(){
        return "PUT-USER";
    }

    @DeleteMapping(value = "/user")
    public String deleteUser(){
        return "DELETE-USER";
    }

    @PostMapping(value = "/user")
    public String postUser(){
        return "POST-USER";
    }
}
