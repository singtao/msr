package com.msr.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msr.shop.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    //查询所有的用户及地址下所有的订单信息
    //表中字段与实体属性映射
    @Results({
            @Result(id = true, column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "birthday",property = "birthday"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "is_deleted",property = "deleted"),
            @Result(column = "gmt_create",property = "gmtCreate"),
            @Result(column = "gmt_modified",property = "gmtModified"),
            //关联映射
            //1:1  ->@One
            @Result(column = "id",property = "address",one = @One(select = "com.msr.shop.mapper.AddressMapper.getAddressByUserId")),
            //1:N  ->@Many
            @Result(column = "id",property = "orders",many = @Many(select = "com.msr.shop.mapper.OrderMapper.getOrdersByUserId"))
    })
    @Select("select * from shop_user")
    public List<User> getUserAndAddressAndOrder();

}