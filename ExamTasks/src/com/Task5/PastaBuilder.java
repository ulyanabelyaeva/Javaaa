package com.Task5;

public class PastaBuilder {
    String name = "no name";
    Size size = Size.Middle;

    PastaBuilder buildName(String name){this.name = name; return this;}
    PastaBuilder buildSize(Size size){this.size = size; return this;}

    Pasta build(){
        Pasta pasta = new Pasta();
        pasta.setName(name);
        pasta.setSize(size);
        return pasta;
    }
}
