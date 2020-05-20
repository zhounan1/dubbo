package com.aust.service.impl;/*
 * Copyright © 2016 睿泰集团 版权所有
 */

import com.aust.service.OrderService;
import com.aust.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Autor zhouNan
 * @Date 2019/10/11 10:23
 * @Description ProductServiceImpl
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
   private OrderService orderService;


    @Override
    public String getName(String name) {
        System.out.println(super.getClass().getName() + "商品被调用了一次" + System.currentTimeMillis());
        orderService.getName(name);
        return "商品名称";
    }
}
