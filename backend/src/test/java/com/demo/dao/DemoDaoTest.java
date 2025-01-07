package com.demo.dao;

import com.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class DemoDaoTest {

    @Autowired
    private DemoDao demoDao;

    @Test
    public void select() {
        System.out.println(demoDao.select(1));
    }

    @Test
    public void insert() {
        User user = new User();
        user.setId(3);
        user.setAge(12);
        user.setName("小红");
        demoDao.insert(user);
    }
}