package com.lcj.dao;

import com.lcj.domain.Brand;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Admin
 * @date 2022/10/20 14:23
 * @Description TODO
 * @Version 1.0
 **/
@Repository
public interface BrandDao {
    //新增Brand
    @Insert("insert into brand (brandName, companyName,slogan,remarks,status) values (#{brandName},#{companyName},#{slogan},#{remarks},#{status})")
    int addBrand(Brand brand);

    //修改用户
    @Update("update brand set brandName=#{brandName},companyName=#{companyName},slogan=#{slogan},remarks=#{remarks},status=#{status} where id=#{id}")
    int updateBrand(Brand brand);

    @Delete("delete from brand where id=#{id}")
    int deleteBrand(Integer id);

    //查询数据总条数
    @Select("select count(*) from brand")
    Integer getTotalCount();

    //查询Brand
    @Select("select * from brand limit #{begin},#{size};")
    List<Brand> getBrandsByPage(@Param("begin") Integer begin, @Param("size") Integer size);

    //按条件查询Brand
    List<Brand> getBrandById(Brand brand);
}
