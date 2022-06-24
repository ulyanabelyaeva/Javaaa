package com.Task5;

public class Pasta {
    String name;
    Size size;
    public void setName(String name) {this.name = name;}
    public void setSize(Size size) {this.size = size;}

    @Override
    public String toString() {
        return "Pasta{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

enum Size{Middle, Big}

