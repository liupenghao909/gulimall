package com.ant.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ant.common.utils.PageUtils;
import com.ant.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 21:20:21
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

