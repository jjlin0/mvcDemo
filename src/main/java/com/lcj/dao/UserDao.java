package com.lcj.dao;

import com.lcj.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: 李传江
 * @date: 2022/11/17
 */
@Repository
public interface UserDao {
    @Insert("insert into user value (null,#{username},#{password},#{name})")
    int save(User user);

    @Update("update user set username=#{username},password=#{password},name=#{name} where id=#{id}")
    int update(User user);

    @Delete("delete from user where id=#{id}")
    int delete(Integer id);

    @Select("select * from user where id=#{id}")
    User getById(Integer id);

    @Select("select * from user")
    List<User> getAll();
}
