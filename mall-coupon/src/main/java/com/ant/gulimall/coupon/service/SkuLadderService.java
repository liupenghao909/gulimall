package com.ant.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ant.common.utils.PageUtils;
import com.ant.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author ant
 * @email ant@gmail.com
 * @date 2022-05-21 20:57:08
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

