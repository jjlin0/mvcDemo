package com.lcj.service;

import com.lcj.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Admin
 * @date 2022/11/16 15:05
 * @Description TODO
 * @Version 1.0
 **/
@Transactional
public interface UserService {
    /**
     * 保存
     */
    boolean save(User user);

    /**
     * 修改
     */
    boolean update(User user);

    /**
     * 删除
     */
    boolean delete(Integer id);

    /**
     * 根据id查询
     */
    User getById(Integer id);

    /**
     * 查询所有
     */
    List<User> getAll();
}
