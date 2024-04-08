package com.zzy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.common.utils.PageUtils;
import com.zzy.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author zzy
 * @email 153730598@qq.com
 * @date 2024-04-09 00:38:39
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

