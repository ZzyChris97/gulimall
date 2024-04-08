package com.zzy.gulimall.order.dao;

import com.zzy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zzy
 * @email 153730598@qq.com
 * @date 2024-04-09 00:38:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
