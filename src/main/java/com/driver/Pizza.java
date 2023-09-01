package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    //private int total;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price = isVeg ? 300 : 400;
        bill = "Base Price Of The Pizza: " + price +"\n";
        System.out.println();
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!bill.contains("Extra Cheese Added: ")){
            price += 80;
            bill += "Extra Cheese Added: 80\n";
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!bill.contains("Extra Toppings Added: ")){
            int toppingPrice = isVeg? 70 : 120;
            price += toppingPrice;
            bill += "Extra Toppings Added: "+toppingPrice+"\n";
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!bill.contains("Paperbag Added: ")){
            price += 20;
            bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        bill += "Total Price: " + price +"\n";
        return this.bill;
    }
}
