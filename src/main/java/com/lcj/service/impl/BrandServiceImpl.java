package com.lcj.service.impl;

import com.lcj.controller.Code;
import com.lcj.dao.BrandDao;
import com.lcj.domain.Brand;
import com.lcj.exception.BusinessException;
import com.lcj.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: 李传江
 * @date: 2022/11/18
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    BrandDao brandDao;
    @Override
    public boolean addBrand(Brand brand) {
        brandDao.addBrand(brand);
        return true;
    }

    @Override
    public boolean updateBrand(Brand brand) {
        brandDao.updateBrand(brand);
        return true;
    }

    @Override
    public boolean deleteBrand(Integer id) {
        if(id<0){
            throw new BusinessException(Code.BUSINESS_ERR,"id数据错误,请重新输入");
        }
        brandDao.deleteBrand(id);
        return true;
    }

    @Override
    public Integer getTotalCount() {
        return brandDao.getTotalCount();
    }

    @Override
    public List<Brand> getBrandsByPage(Integer begin, Integer size) {
        return brandDao.getBrandsByPage(begin, size);
    }

    @Override
    public List<Brand> getBrandsBySearch(Brand brand) {
        return brandDao.getBrandById(brand);
    }
}
