package com.ant.gulimall.order.dao;

import com.ant.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 21:20:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
