package com.study.service;

import com.study.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart, Integer userId);
}
