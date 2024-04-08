package com.zzy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.common.utils.PageUtils;
import com.zzy.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author zzy
 * @email 153730598@qq.com
 * @date 2024-04-09 00:38:39
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

