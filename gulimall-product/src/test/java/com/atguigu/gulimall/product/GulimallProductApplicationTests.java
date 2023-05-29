package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;

//import org.junit.jupiter.api.Test;
import java.awt.*;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L); //Id为long型，所以在数字1后加上L
        brandEntity.setDescript("华为");

//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
        log.info("测试成功...");
//        System.out.println("测试测试");

//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) ->{
            System.out.println(item);
        });
    }

    @Test
    public void test1(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L); //Id为long型，所以在数字1后加上L
        brandEntity.setDescript("华为");

        //brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功...");

//        brandService.updateById(brandEntity);
    }

    @Test
    public void test2(){
        String fileName = "huefnjfewop.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }


}
