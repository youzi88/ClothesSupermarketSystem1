package com.vince.service.impl;

import com.vince.bean.Order;
import com.vince.service.OrderService;
import com.vince.utils.BusinessException;
import com.vince.utils.OrderIo;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderIo orderIo = new OrderIo();
    @Override
    public void buyProduct(Order o) throws BusinessException {
    orderIo.add(o);
    }
    @Override
    public List<Order> list() throws BusinessException {

        return orderIo.list();
    }
    @Override
    public Order findById(int orderId) throws BusinessException {
        return orderIo.findByOrderId(orderId);
    }
}
