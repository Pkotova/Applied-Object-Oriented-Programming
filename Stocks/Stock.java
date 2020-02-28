package com;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock() {
        this.symbol = "a";
        this.name = "default";
        this.previousClosingPrice = 10;
        this.currentPrice = 15;
    }

    public Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice) {
        this.symbol = newSymbol;
        this.name = newName;
        this.previousClosingPrice = newPreviousClosingPrice;
        this.currentPrice = newCurrentPrice;
    }

    public Stock(String newSymbol, String newName) {
        this.symbol = newSymbol;
        this.name = newName;
        this.previousClosingPrice = 1.0;
        this.currentPrice = 2.0;
    }

    public Stock(Stock newStock) {
        this.symbol = newStock.symbol;
        this.name = newStock.name;
        this.previousClosingPrice = newStock.previousClosingPrice;
        this.currentPrice = newStock.currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String newSymbol) {
        if (newSymbol != null) {
            this.symbol = newSymbol;
        } else {
            this.symbol = "a";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null) {
            this.name = newName;
        } else {
            this.name = "a";
        }
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        if (newPreviousClosingPrice > 0) {
            this.previousClosingPrice = newPreviousClosingPrice;
        } else {
            this.previousClosingPrice = 1;
        }
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double newCurrentPrice) {
        if (newCurrentPrice > 0) {
            this.currentPrice = newCurrentPrice;
        } else {
            this.currentPrice = 1;
        }
    }

    public double changePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public void displayData() {
        System.out.println("---------------------------------");
        System.out.println("Symbol of the product:" + this.symbol);
        System.out.println("Name of the product:" + this.name);
        System.out.println("Previous price of the product:" + this.previousClosingPrice);
        System.out.println("Current price of the product:" + this.currentPrice);
        System.out.print("The prince change(percentage): ");
        System.out.printf("'%.02f'", changePercent());
        System.out.println("%");
        System.out.println();
    }
}
