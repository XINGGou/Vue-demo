package com.xxh.controller;

import com.xxh.entity.User;
import com.xxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xxh
 * @date 2021/2/19 16:59
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("/findAll")
    public Map<String,Object> findAll(Integer page,Integer rows){
        Map<String, Object> map = new HashMap<>();
        List<User> results = userService.findAll();
        map.put("total",10);
        map.put("totalPage",1);
        map.put("page",page);
        map.put("results",results);
        return map;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody User user) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            userService.save(user);
            map.put("success",true);
            map.put("msg","添加用户信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","添加用户信息失败"+e.getMessage());
        }
        return map;
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @GetMapping("/delete")
    public Map<String, Object> delete(String id){
        HashMap<String, Object> map = new HashMap<>();
        try {
            userService.delete(id);
            map.put("success",true);
            map.put("msg","删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","删除失败"+e.getMessage());
        }
        return map;
    }

    /**
     * 查找一个用户的信息
     * @param id
     * @return
     */
    @GetMapping("/findOne")
    public User findOne(String id){
        return userService.findById(id);
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @CrossOrigin
    @PostMapping("/update")
    public Map<String,Object> update(@RequestBody User user) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            userService.update(user);
            map.put("success",true);
            map.put("msg","修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","修改失败");
        }
        return map;
    }

}
