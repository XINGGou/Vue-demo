package com.xxh;

import com.xxh.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xxh
 * @date 2021/2/4 11:43
 */
@SpringBootTest(classes = VueDay04Application.class)
@RunWith(SpringRunner.class)
public class TestUserDao {

    @Autowired(required = false)
    private UserDao userDao;

    @Test
    public void testFindAll() {
        userDao.findAll().forEach(user -> System.out.println("user = " + user));
    }
}
