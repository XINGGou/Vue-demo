package com.xxh.service;

import com.xxh.entity.User;

import java.util.List;

/**
 * @author xxh
 * @date 2021/2/19 16:54
 */
public interface UserService {

    void save(User user);

    void update(User user);

    void delete(String id);

    List<User> findAll();

    User findById(String id);
}
