package com.david.model;

public class Game {
    public String name;
    public double price;
    public int yearOfPublishing;

    public void print(){
        System.out.println("Name: " + name );
        System.out.println("Year of publication: " + yearOfPublishing );
        System.out.println("Price in USD: " + price);
    }

    public void install(){
        System.out.println("The game " + name + " is being installed!");
    }

}
