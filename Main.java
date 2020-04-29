package com.company;

public class Main {

    public static void main(String[] args) {
        Furniture bed = new Furniture();
        System.out.println(bed);
        House bedroom = new House();
        System.out.println(bedroom);
        House.CreateHouse("Warszawska 1");
    }
}
