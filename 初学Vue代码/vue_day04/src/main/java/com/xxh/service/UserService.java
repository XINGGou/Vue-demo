package com.xxh.service;


import com.xxh.entity.User;

import java.util.List;

/**
 * @author xxh
 * @date 2021/2/4 14:14
 */
public interface UserService {

    //查询所有用户
    List<User> findAll();

    //保存用户信息
    void save(User user);

    //根据id删除用户信息
    void delete(String id);

    //查询一个人的信息
    User findOne(String id);

    //修改用户信息
    void update(User user);

    //模糊搜索
    List<User> findNameOrPhoneCode(String name, String code);
}
