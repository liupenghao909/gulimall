package com.ant.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ant.common.utils.PageUtils;
import com.ant.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 20:57:08
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

