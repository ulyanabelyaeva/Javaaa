package com.entity;

import org.springframework.stereotype.Component;

@Component
public class StrongKnight implements Knight{
    @Override
    public void fight() {
        System.out.println("Strong knight fight");
    }
}
