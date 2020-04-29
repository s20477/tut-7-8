package com.company;

import java.util.ArrayList;

public class Room {
    private int area;
    private ArrayList<Furniture> furniture = new ArrayList<Furniture>();
    int VATPriceOfAll = 0;

    public Room (int area, ArrayList<Furniture> furniture) {
        this.area = area;
        this.furniture = furniture;
    }

    public ArrayList<Furniture> getFurniture() {
        return furniture;
    }
    public int VATPriceOfAll (ArrayList<Furniture> furniture) {
        for (int i = 0; i < furniture.size(); i++) {
            VATPriceOfAll += furniture.get(i).getVATPrice();
        }
        return VATPriceOfAll;
    }

}
