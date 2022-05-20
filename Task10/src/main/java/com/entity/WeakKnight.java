package com.entity;

import org.springframework.stereotype.Component;

@Component
public class WeakKnight implements Knight{
    @Override
    public void fight() {
        System.out.println("Weak knight run away");
    }
}
