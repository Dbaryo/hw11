package com.david.model;

public class VendingMachine {

    public void buyDrink ( double x ){
        if ( x < 4.5 ){ System.out.println("Not enough money!"); }
        else if ( x > 10.0 ) { System.out.println("Too much money!"); }
        else { System.out.println("Thank you! please take your drink."); }
    }
}
