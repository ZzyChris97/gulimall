package com.zzy.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-PLUS
 *  1） 导入依赖
 *  2） 配置
 *      1、配置数据源
 *          1）导入数据库驱动
 *          2） 在application.yml中导入数据库配置
 *      2、配置Mybatis-Plus
 *          1） 使用@MapperScan
 *          2) 告诉MyBatis-Plus，sql映射文件位置
 */
@MapperScan("com.zzy.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
