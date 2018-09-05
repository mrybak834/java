package com.mrybak834.patterns.command.Order;

import com.mrybak834.patterns.command.Stock;

public class BuyStock implements Order{
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }

}
