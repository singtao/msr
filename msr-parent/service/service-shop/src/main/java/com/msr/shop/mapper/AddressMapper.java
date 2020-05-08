package com.msr.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msr.shop.entity.Address;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
public interface AddressMapper extends BaseMapper<Address> {
    //根据用户ID，查询指定地址
    @Select("select * from shop_address where id = #{userId}")
    public Address getAddressByUserId(String userId);
}