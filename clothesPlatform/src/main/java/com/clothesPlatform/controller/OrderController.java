package com.clothesPlatform.controller;

import com.clothesPlatform.entity.Order;
import com.clothesPlatform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @PostMapping("/saveOrder")
    public String saveOrder(@RequestBody Order order){
        Date date = new Date();
        order.setDate(date);
        String order1 = orderService.saveOrder(order);
        if(order1 != null){
            return "success";
        }else {
            return "error";
        }
    }
    @GetMapping("/findAllOrder/{page}/{size}")
    public Page<Order> findAllOrder(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        Pageable pageable = PageRequest.of(page-1,size);
        return orderService.findAllOrder(page,size);
    }

    @GetMapping("/findOrder/{orderId}")
    public Order findOrder(@PathVariable("orderId") int orderId) {
        return orderService.findOrder(orderId);
    }

    @DeleteMapping("/deleteOrder")
    public void deleteOrder(int orderId) {
        orderService.deleteOrder(orderId);
    }
}
