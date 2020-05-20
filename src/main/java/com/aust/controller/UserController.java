package com.aust.controller;/*
 * Copyright © 2016 睿泰集团 版权所有
 */

import com.aust.service.OrderService;
import com.aust.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Autor zhouNan
 * @Date 2019/10/11 10:25
 * @Description UserController
 **/
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;

    @RequestMapping("/get")
    public String  get(){
        String order = orderService.getName("订单");
        String product = productService.getName("商品");
        System.out.println(order + product);
        return  "index";
    }



}
