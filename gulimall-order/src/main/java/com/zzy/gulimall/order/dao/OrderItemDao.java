package com.zzy.gulimall.order.dao;

import com.zzy.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zzy
 * @email 153730598@qq.com
 * @date 2024-04-09 00:38:39
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
