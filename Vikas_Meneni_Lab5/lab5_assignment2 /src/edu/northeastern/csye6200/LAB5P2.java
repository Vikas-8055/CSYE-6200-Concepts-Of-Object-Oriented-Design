package edu.northeastern.csye6200;

public class LAB5P2 {
	
    public static void main(String[] args) {
        
        Stock appleStock = new Stock("AAPL");
        appleStock.setValue(50);
        appleStock.setQuantity(20);

        Stock googleStock = new Stock("GOOGL");
        googleStock.setValue(20);
        googleStock.setQuantity(20);


        System.out.println("Created the following stocks:");
        System.out.println(appleStock);
        System.out.println(googleStock);
        System.out.println("Total Stock Value: " + Stock.getTotalValue());


        System.out.println("\nUpdating the quantity of Apple stock");
        appleStock.setQuantity(10);
        System.out.println(appleStock);
        System.out.println("Total Stock Value: " + Stock.getTotalValue());


        System.out.println("\nUpdating the value of Google stock");
        googleStock.setValue(100);
        System.out.println(googleStock);
        System.out.println("Total Stock Value: " + Stock.getTotalValue());
    }
	
}

class Stock {
 
    private final String symbol;
    private int value;
    private int quantity;


    private static int totalValue = 0;

  
    public Stock(String symbol) {
        if (symbol == null || symbol.isEmpty()) {
            throw new IllegalArgumentException("Stock symbol cannot be null or empty.");
        }
        this.symbol = symbol;
    }


    public static int getTotalValue() {
        return totalValue;
    }

    public static void updateTotalValue(int oldValue, int oldQuantity, int newValue, int newQuantity) {
        totalValue -= (oldValue * oldQuantity);
        totalValue += (newValue * newQuantity);
    }

    
    public void setQuantity(int quantity) {
        Stock.updateTotalValue(this.value, this.quantity, this.value, quantity);
        this.quantity = quantity;
    }

    public void setValue(int value) {
        Stock.updateTotalValue(this.value, this.quantity, value, this.quantity);
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toString() {
        return "Stock [" + symbol + ", Value: $" + value + ", Quantity: " + quantity + "]";
    }
}





