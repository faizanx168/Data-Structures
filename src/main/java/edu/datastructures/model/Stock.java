package edu.datastructures.model;

import edu.learning.datatructure.java17.custom.model.KeyAndValue;

public class Stock extends KeyAndValue<String,Stock> {
    private String symbol;
    private float yield;

    public Stock(String symbol, float yield) {
        this.symbol = symbol;
        this.setKey(symbol);
        this.yield = yield;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getYield() {
        return yield;
    }

    @Override
    public String getKey() {
        return super.getKey();
    }

    @Override
    public Stock getValue() {
        return this;
    }

    @Override
    public String toString() {
        return
                "symbol='" + symbol + '\'' +
                ", yield=" + yield ;
    }
}
