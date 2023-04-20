package com.mall.phonemall.order.dao;

import com.mall.phonemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chp
 * @email 839550877@qq.com
 * @date 2023-03-16 22:43:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
