package com;

import java.util.Scanner;

public class StockTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//default constructor
        Stock stock1 = new Stock();
        stock1.displayData();
//general purpose constructor with all data
        Stock stock2 = new Stock("k", "Computer", 1200.99, 1449.99);
        stock2.displayData();
//general purpose constructor with only symbol and name
        Stock stock3 = new Stock("%", "AirPods");
        stock3.displayData();
//copy constructor
        Stock stock4 = new Stock(stock2);
        stock4.displayData();
//usage of setters
        Stock personalStock = new Stock();
        String symbol, name;
        double previousPrice, currentPrice;

        System.out.print("Symbol of product: ");
        symbol = input.next();
        personalStock.setSymbol(symbol);

        System.out.print("Name of product: ");
        input.nextLine();
        name = input.nextLine();
        personalStock.setName(name);

        System.out.print("Previous price of product: ");
        previousPrice = input.nextDouble();
        personalStock.setPreviousClosingPrice(previousPrice);

        System.out.print("Current price of product: ");
        currentPrice = input.nextDouble();
        personalStock.setCurrentPrice(currentPrice);

//usage of getters
        System.out.println("---------------------------------");
        System.out.println("Symbol of the product:" + personalStock.getSymbol());
        System.out.println("Name of the product:" + personalStock.getName());
        System.out.println("Previous price of the product:" + personalStock.getPreviousClosingPrice());
        System.out.println("Current price of the product:" + personalStock.getCurrentPrice());
        System.out.print("Price changing(percentage): ");
        System.out.printf("%.02f'", personalStock.changePercent());
        System.out.print("%");
        System.out.println();
    }
}
