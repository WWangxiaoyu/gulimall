package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author wangxiaoyu
 * @email wangxiaoyu@gmail.com
 * @date 2023-05-16 16:08:01
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
