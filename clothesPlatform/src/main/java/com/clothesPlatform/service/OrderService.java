package com.clothesPlatform.service;

import com.clothesPlatform.entity.Clothing;
import com.clothesPlatform.entity.Order;
import org.springframework.data.domain.Page;

public interface OrderService {

    String saveOrder(Order order);

    Page<Order> findAllOrder(int page,int size);

    Order findOrder(int order);

    void deleteOrder(int order);
}
