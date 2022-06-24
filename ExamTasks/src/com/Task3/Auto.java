package com.Task3;

public class Auto {

    FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy){
        this.fillStrategy = fillStrategy;
    }
    public void fill() {
        fillStrategy.fill();
    }

    // достижение взаимозаменяемости
    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }
}
