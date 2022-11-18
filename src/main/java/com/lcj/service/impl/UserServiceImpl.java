package com.lcj.service.impl;

import com.lcj.controller.Code;
import com.lcj.dao.UserDao;
import com.lcj.domain.User;
import com.lcj.exception.BusinessException;
import com.lcj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Author Admin
 * @date 2022/11/16 15:05
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public boolean save(User user) {
        userDao.save(user);
        return true;
    }

    @Override
    public boolean update(User user) {
        userDao.update(user);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        userDao.delete(id);
        return true;
    }

    @Override
    public User getById(Integer id) {
        if(id<0){
            throw new BusinessException(Code.BUSINESS_ERR,"id数据错误,请重新输入");
        }
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}

