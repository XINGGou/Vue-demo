package com.xxh.dao;

import com.xxh.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xxh
 * @date 2021/2/19 16:42
 */

@Mapper
public interface UserDao {

    void save(User user);

    void update(User user);

    void delete(String id);

    List<User> findAll();

    User findById(String id);

}
