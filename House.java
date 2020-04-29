package com.company;

import java.util.ArrayList;

public class House {
    private String address;
    ArrayList<Room> rooms = new ArrayList<Room>();
    public static int roomNum = 0;

    private House (String address, ArrayList<Room> rooms) {
        this.rooms = rooms;
        this.address = address;
    }

    public House(String address) {
        this.address = address;
    }

    public House() {

    }

    public static void CreateHouse(String address){
        House house = new House(address);
    }

    void addRoom(Room room){
        rooms.add(room);
        roomNum++;
    }

    void addRooms(ArrayList<Room> newRooms){
        for(int i = 0; i < newRooms.size(); i++){
            rooms.add(newRooms.get(i));
            roomNum ++;
        }
    }

    public static int getRoomNum() {
        return roomNum;
    }
}