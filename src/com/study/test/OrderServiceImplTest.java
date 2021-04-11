package com.study.test;

import com.study.pojo.Cart;
import com.study.pojo.CartItem;
import com.study.service.OrderService;
import com.study.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderServiceImplTest {

    public static class OrderServiceTest {
        public static void main(String[] args) {
            System.out.println("ss");
        }
        @Test
        public void createOrder() {
            Cart cart = new Cart();

            cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000)));
            cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000)));
            cart.addItem(new CartItem(2, "数据结构与算法", 1, new BigDecimal(100),new BigDecimal(100)));

            OrderService orderService = new OrderServiceImpl();

            System.out.println( "订单号是：" + orderService.createOrder(cart, 1) );

        }
    }
}