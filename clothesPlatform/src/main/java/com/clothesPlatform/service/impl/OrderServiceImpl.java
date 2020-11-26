package com.clothesPlatform.service.impl;

import com.clothesPlatform.entity.Clothing;
import com.clothesPlatform.entity.Order;
import com.clothesPlatform.repository.OrderRepository;
import com.clothesPlatform.repository.UserRepository;
import com.clothesPlatform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public String saveOrder(Order order) {
        Order result = orderRepository.save(order);
        if (result != null) {
            return "success";
        }else {
            return "error";
        }
    }

    @Override
    public Page<Order> findAllOrder(int page, int size) {
        Pageable pageable = PageRequest.of(page-1,size);
        return orderRepository.findAll(pageable);
    }

    @Override
    public Order findOrder(int orderId) {
        return orderRepository.findById(orderId).get();
    }

    @Override
    public void deleteOrder(int orderId) {
        orderRepository.deleteById(orderId);
    }


}
