package com.xxh.controller;

import com.alibaba.druid.util.StringUtils;
import com.xxh.entity.User;
import com.xxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xxh
 * @date 2021/2/4 14:18
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有方法
    @GetMapping("/findAll")
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    //保存用户信息
    @PostMapping("/save")
    public Map<String, Object> save(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        try {
            if (StringUtils.isEmpty(user.getId())) {
                userService.save(user);
            } else {
                userService.update(user);
            }
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("message", "用户保存失败");
        }
        ;
        return map;
    }

    //删除用户信息
    @GetMapping("/delete")
    public Map<String, Object> delete(String id) {
        Map<String, Object> map = new HashMap<>();
        try {
            userService.delete(id);
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("sucess", false);
            map.put("message", "删除用户失败，请稍后重试！");
        }
        return map;
    }

    //查询一个人的信息
    @GetMapping("/findOne")
    public User findOne(String id) {
        User user = userService.findOne(id);
        return user;
    }

    //模糊搜索
    @GetMapping("/findLike")
    public List<User> findNameOrCode(String name, String code) {
        return userService.findNameOrPhoneCode(name, code);
    }

}
