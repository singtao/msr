package com.msr.shop.controller;


import com.msr.commonutils.R;
import com.msr.shop.entity.User;
import com.msr.shop.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
@Api(description="用户管理")
@RestController
@RequestMapping("/admin/shop/user")
@CrossOrigin //跨域
public class UserController {
    @Autowired
    private UserService userService;

    //查询所有的用户
    @GetMapping
    public R getUserAndAddressAndOrder(){
        /**
         * users:此对象中包含了所有的记录（用户、地址、订单）
         */
        List<User> users = userService.getUserAndAddressAndOrder();
        return R.ok().data("users",users);
    }
}
