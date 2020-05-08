package com.msr.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.shop.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
public interface UserService extends IService<User> {
    //查询所有的用户，包含（地址、订单）
    public List<User> getUserAndAddressAndOrder();
}
