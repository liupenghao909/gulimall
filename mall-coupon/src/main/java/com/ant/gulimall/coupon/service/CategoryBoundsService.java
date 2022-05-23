package com.ant.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ant.common.utils.PageUtils;
import com.ant.gulimall.coupon.entity.CategoryBoundsEntity;

import java.util.Map;

/**
 * 商品分类积分设置
 *
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 20:57:09
 */
public interface CategoryBoundsService extends IService<CategoryBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

