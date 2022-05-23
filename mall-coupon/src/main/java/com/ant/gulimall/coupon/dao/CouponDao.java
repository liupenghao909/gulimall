package com.ant.gulimall.coupon.dao;

import com.ant.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 20:57:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
