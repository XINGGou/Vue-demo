package com.xxh.vue_day07.controller;


import com.xxh.vue_day07.enity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author xxh
 * @date 2021/2/18 11:43
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @GetMapping("/findAll")
    public List<User> findAll(){
        System.out.println("查询所有....");
        List<User> list = Arrays.asList(
                new User("1","xiaoxu",21,new Date()),
                new User("2","xiaochen",22,new Date()),
                new User("3","xiaowu",20,new Date())
        );
        return list;
    }
}
