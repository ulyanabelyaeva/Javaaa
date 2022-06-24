package com.Task2;

public class PastaCookFactory implements CookFactory{
    @Override
    public Cook createCook() {
        return new PastaCook();
    }
}
