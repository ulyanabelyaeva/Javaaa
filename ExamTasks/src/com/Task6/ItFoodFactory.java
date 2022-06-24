package com.Task6;

public class ItFoodFactory implements FoodFactory{
    @Override
    public Pasta getPasta() {
        return new ItPasta();
    }

    @Override
    public Pizza getPizza() {
        return new ItPizza();
    }
}
