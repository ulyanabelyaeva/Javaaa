package com.Task2;

public class PizzaCookFactory implements CookFactory{
    @Override
    public Cook createCook() {
        return new PizzaCook();
    }
}
