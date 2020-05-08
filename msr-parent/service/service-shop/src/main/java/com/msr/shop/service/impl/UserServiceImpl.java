package com.msr.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msr.shop.entity.User;
import com.msr.shop.mapper.UserMapper;
import com.msr.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserAndAddressAndOrder() {
        return userMapper.getUserAndAddressAndOrder();
    }
}