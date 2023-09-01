package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price = isVeg ? 300 : 400;
        total += price;
        bill = "Base Price Of The Pizza: " + price +"\n";
        System.out.println();
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!bill.contains("Extra Cheese Added: ")){
            int cheesePrice = 80;
            total += cheesePrice;
            bill += "Extra Cheese Added: " +cheesePrice+"\n";
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!bill.contains("Extra Toppings Added: ")){
            int toppingPrice = isVeg? 70 : 120;
            total += toppingPrice;
            bill += "Extra Toppings Added: "+toppingPrice+"\n";
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!bill.contains("Paperbag Added: ")){
            int takeout = 20;
            total += takeout;
            bill += "Paperbag Added: " + takeout +"\n";
        }
    }

    public String getBill(){
        // your code goes here
        bill += "Total Price: " + total;
        return this.bill;
    }
}
