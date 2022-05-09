package com.helloworld;

public class HelloWorld {
    static int square(int number){
        return number*number;
    }
    public static void main(String[] args) {
        String name= "Herilaza";
        int year= 2022;
        System.out.println("Hello "+name+", this is the year : "+year);
        System.out.println(HelloWorld.square(4));
    }
}
