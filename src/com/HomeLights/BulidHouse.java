package com.HomeLights;

public class BulidHouse {
    public static void main(String [] args){

        Home obj1 = new RoomOne(4);
        Home obj2 = new RoomTwo(5);
        System.out.println(obj1.noOfLights());
        System.out.println(obj2.noOfLights());
    }
}
