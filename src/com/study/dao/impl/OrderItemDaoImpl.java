package com.study.dao.impl;


import com.study.dao.OrderItemDao;
import com.study.pojo.OrderItem;

/**
 * @author hw
 * @program BooksSys
 * @description
 * @create 2021-03-29 08:10
 **/
public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {
    @Override
    public int saveOrderItem(OrderItem orderItem) {
        String sql = "insert into t_order_item(`name`,`count`,`price`,`total_price`,`order_id`) values(?,?,?,?,?)";
        return update(sql,orderItem.getName(),orderItem.getCount(),orderItem.getPrice(),orderItem.getTotalPrice(),orderItem.getOrderId());
    }
}