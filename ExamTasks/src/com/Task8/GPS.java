package com.Task8;

public class GPS extends Decorator {
    Car car;

    public GPS(Car car) {
        this.car = car;
    }

    public String getInfo() {
        return car.getInfo() + " + GPS";
    }

    public int getPrice() {
        return car.getPrice() + 1500;
    }

}
