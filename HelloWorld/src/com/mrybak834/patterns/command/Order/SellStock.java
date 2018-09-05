package com.mrybak834.patterns.command.Order;

import com.mrybak834.patterns.command.Stock;

public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
