package com.ant.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ant.common.utils.PageUtils;
import com.ant.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 20:57:09
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

