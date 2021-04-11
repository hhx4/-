package com.study.service.impl;

import com.study.dao.BookDao;
import com.study.dao.OrderDao;
import com.study.dao.OrderItemDao;
import com.study.dao.impl.BookDaoImpl;
import com.study.dao.impl.OrderDaoImpl;
import com.study.dao.impl.OrderItemDaoImpl;
import com.study.pojo.*;
import com.study.service.OrderService;

import java.util.Date;
import java.util.Map;

/**
 * @author hw
 * @program BooksSys
 * @description
 * @create 2021-03-30 17:35
 **/
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = new OrderDaoImpl();
    private OrderItemDao orderItemDao = new OrderItemDaoImpl();
    private BookDao bookDao = new BookDaoImpl();

    @Override
    public String createOrder(Cart cart, Integer userId) {
        String orderId = System.currentTimeMillis()+""+userId;
        Order order = new Order(orderId, new Date(), cart.getTotalPrice(), 0, userId);
        orderDao.saveOrder(order);
        for (Map.Entry<Integer, CartItem> entry : cart.getItems().entrySet()) {
            CartItem cartItem = entry.getValue();
            OrderItem orderItem = new OrderItem(null, cartItem.getName(), cartItem.getCount(), cartItem.getPrice(), cartItem.getTotalPrice(), orderId);
            orderItemDao.saveOrderItem(orderItem);

            Book book = bookDao.queryBookById(cartItem.getId());
            book.setSales(book.getSales() + cartItem.getCount());
            book.setStock(book.getStock() - cartItem.getCount());
            bookDao.updateBook(book);
        }

        cart.clear();
        return orderId;
    }
}