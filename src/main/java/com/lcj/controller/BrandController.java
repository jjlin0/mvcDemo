package com.lcj.controller;

import com.lcj.domain.Brand;
import com.lcj.domain.PageBean;
import com.lcj.service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static com.lcj.controller.Code.GET_ERR;
import static com.lcj.controller.Code.GET_OK;

/**
 * @description:
 * @author: 李传江
 * @date: 2022/11/17
 */
@RestController
@RequestMapping("/brands")
public class BrandController {
    @Resource
    private BrandService brandService;

    @PostMapping
    public Result addBrand(@RequestBody Brand brand) {
        boolean flag = brandService.addBrand(brand);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result updateBrand(@RequestBody Brand brand) {
        boolean flag = brandService.updateBrand(brand);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteBrand(@PathVariable Integer id) {
        boolean flag = brandService.deleteBrand(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{status}/{companyName}/{brandName}")
    public Result getBrandsBySearch(@PathVariable Integer status,@PathVariable String companyName,@PathVariable String brandName) {
        Brand brand = new Brand(null,brandName,companyName,null,null,status);
        List<Brand> brandList = brandService.getBrandsBySearch(brand);
        Integer totalCount = brandService.getTotalCount();
        return getPageBean(totalCount,brandList);
    }

    @GetMapping("/{currentPage}/{size}")
    public Result getBrandsByPage(@PathVariable Integer currentPage, @PathVariable Integer size) {
        Integer totalCount = brandService.getTotalCount();
        Integer begin=(currentPage-1)*size;
        List<Brand> brandList = brandService.getBrandsByPage(begin, size);
        return getPageBean(totalCount,brandList);
    }

    private Result getPageBean(Integer totalCount,List<Brand> brandList) {
        PageBean<Brand> pageBean = new PageBean<>(totalCount, brandList);
        Integer code = brandList != null && totalCount != null ? GET_OK : GET_ERR;
        String msg = brandList != null && totalCount != null ? "" : "系统繁忙,请稍后再试!";
        return new Result(code, msg, pageBean);
    }
}
