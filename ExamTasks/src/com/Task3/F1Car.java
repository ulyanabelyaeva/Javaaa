package com.Task3;

public class F1Car extends Auto {
    public F1Car() {
        super(new F1PitstopStrategy());
    }
}
