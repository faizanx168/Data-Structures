package edu.datastructures.model;

import com.jbbwebsolution.fileutility.SVColumn;


public class simpleStock {
   @SVColumn(position = 1)
   private String symbol;
    @SVColumn(position =  7, searchFor = "N/A", replaceWith = "0")

    private float marketCapInBillions;
    @SVColumn(position = 14)
    private String growthRate;

    public String getSymbol() {
        return symbol;
    }

    public float getMarketCapInBillions() {
        return marketCapInBillions;
    }

    public String getGrowthRate() {
        return growthRate;
    }

    @Override
    public String toString() {
        return "simpleStock{" +
                "symbol='" + symbol + '\'' +
                ", marketCapInBillions=" + marketCapInBillions +
                ", growthRate='" + growthRate + '\'' +
                '}';
    }
}
