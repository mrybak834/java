package com.mrybak834.patterns.command;

import com.mrybak834.patterns.command.Order.BuyStock;
import com.mrybak834.patterns.command.Order.SellStock;

public class CommandDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
