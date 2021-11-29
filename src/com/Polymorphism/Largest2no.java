package com.Polymorphism;

public class Largest2no
{
    public static void largestOfNumbers(int x,int y){
        if(x>y)
            System.out.println(x);
        else
            System.out.println(y);
    }

    public static void largestOfNumbers(int x,int y,int z){
        if(x>y && x>z)
            System.out.println(x);
        if(y>x && y>z)
            System.out.println(y);
        if(z>x && z>y)
            System.out.println(z);
    }

    public static void main(String [] args){
        largestOfNumbers(5,6);
        largestOfNumbers(5,6,7);
    }
}