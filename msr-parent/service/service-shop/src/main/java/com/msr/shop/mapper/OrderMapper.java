package com.msr.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msr.shop.entity.Order;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
public interface OrderMapper extends BaseMapper<Order> {
    //根据用户ID，查询此用户下所有的订单
    @Select("select * from shop_order where user_id = #{userId}")
    public List<Order> getOrdersByUserId(String userId);
}