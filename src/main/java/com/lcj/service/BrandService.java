package com.lcj.service;

import com.lcj.domain.Brand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Admin
 * @date 2022/11/16 15:05
 * @Description TODO
 * @Version 1.0
 **/
@Transactional
public interface BrandService {
    //新增Brand
    boolean addBrand(Brand brand);

    //修改品牌
    boolean updateBrand(Brand brand);

    //删除品牌
    boolean deleteBrand(Integer id);

    //查询数据总条数
    Integer getTotalCount();

    //查询Brand
    List<Brand> getBrandsByPage(Integer begin, Integer size);

    //按条件查询Brand
    List<Brand> getBrandsBySearch(Brand brand);
}
