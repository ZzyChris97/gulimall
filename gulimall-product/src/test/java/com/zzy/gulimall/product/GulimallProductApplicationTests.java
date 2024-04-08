package com.zzy.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzy.gulimall.product.entity.BrandEntity;
import com.zzy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

        // 新增
//        brandEntity.setName("华子");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        // 修改
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//        brandService.updateById(brandEntity);

        // 查询
        List<BrandEntity> brandEntities = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntities.forEach(item -> {
            System.out.println(item);
        });


    }

}
