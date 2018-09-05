package com.mrybak834.patterns.command;

import com.mrybak834.patterns.command.Order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Command class
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();


    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
