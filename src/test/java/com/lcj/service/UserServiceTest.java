package com.lcj.service;

import com.lcj.config.SpringConfig;
import com.lcj.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: 李传江
 * @date: 2022/11/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void test01() {
        List<User> all = userService.getAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
}
