package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangxiaoyu
 * @email wangxiaoyu@gmail.com
 * @date 2023-05-15 17:36:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
