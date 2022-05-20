package com.entity;


import org.springframework.stereotype.Component;

@Component
public class KingOfKnight implements Knight{
    @Override
    public void fight() {
        System.out.println("King of knight here");
    }
}
