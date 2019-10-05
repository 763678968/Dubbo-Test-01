package com.example.gmall.service.impl;

import com.example.gmall.bean.UserAddress;
import com.example.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "浙江省杭州市浙江大学玉泉校区", "1", "张三", "0571-88888888", "Y");
        UserAddress address2 = new UserAddress(1, "浙江省杭州市浙江大学西溪校区", "1", "李四", "0571-66666666", "Y");

        return Arrays.asList(address1, address2);
    }
}
