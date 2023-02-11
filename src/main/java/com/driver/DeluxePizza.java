package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        //calling constructor of pizza class (parent class)
        super(isVeg);
        // your code goes here
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
