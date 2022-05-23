package com.ant.gulimall.order.dao;

import com.ant.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 21:20:21
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
