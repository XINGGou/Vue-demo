package com.xxh.dao;

import com.xxh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xxh
 * @date 2021/2/4 11:35
 */
public interface UserDao {

    //查询所有
    List<User> findAll();

    //保存用户信息
    void save(User user);

    //根据id删除用户信息
    void delete(String id);

    //根据id查询一个人信息
    User findOne(String id);

    //修改用户信息
    void update(User user);

    //根据姓名或者电话进行模糊查询
    List<User> findNameOrPhoneCode(@Param("name") String name, @Param("code") String phoneCode);
}
