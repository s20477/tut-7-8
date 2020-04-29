package com.company;

public class Furniture {
    private String name;
    private int price;
    private static int VAT = 1;

    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Furniture() {

    }
    public int getPrice()
    {
        return price;
    }

    public int getVATPrice() {
        return price + price * VAT;
    }

}


