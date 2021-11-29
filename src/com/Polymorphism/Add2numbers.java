package com.Polymorphism;

public class Add2numbers {

 public static int addNumbers(int x,int y)
 {
  return x+y;

 }

 public static String addNumbers(String x,String y)
 {
  return x+y;

 }
 public static void main(String [] args){

  System.out.println(addNumbers(5,6));
  System.out.println(addNumbers("Sita","Laxmi"));

 }
}
