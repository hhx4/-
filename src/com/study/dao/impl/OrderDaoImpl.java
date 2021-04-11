package com.study.dao.impl;

import com.study.dao.OrderDao;
import com.study.pojo.Order;

/**
 * @author hw
 * @program BooksSys
 * @description
 * @create 2021-03-29 08:02
 **/
public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {
        String sql = "insert into t_order(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";

        return update(sql, order.getOrderId(), order.getCreateTime(),order.getPrice(), order.getStatus(), order.getUserId());
    }
}