package com.Task6;

public class RuFoodFactory implements FoodFactory{
    @Override
    public Pasta getPasta() {
        return new RuPasta();
    }

    @Override
    public Pizza getPizza() {
        return new ItPizza();
    }
}
