package com.ant.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ant.common.utils.PageUtils;
import com.ant.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 21:20:21
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

