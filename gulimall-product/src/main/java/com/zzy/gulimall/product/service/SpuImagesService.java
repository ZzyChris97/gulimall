package com.zzy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.common.utils.PageUtils;
import com.zzy.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zzy
 * @email 153730598@qq.com
 * @date 2024-03-31 22:56:39
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

