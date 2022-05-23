package com.ant.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ant.common.utils.PageUtils;
import com.ant.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 20:57:09
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

