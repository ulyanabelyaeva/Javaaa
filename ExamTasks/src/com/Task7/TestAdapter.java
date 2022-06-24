package com.Task7;

/**
 * Опишите паттерн адаптер, его отличие от декоратора, приведите пример реализации
 *
 * Паттерн «Адаптер» позволяет какой-то объект с одним интерфейсом подстроить под другой интерфейс
 * */

public class TestAdapter {
    public static void main(String[] args) {
        AdapterPNGtoSVG adapter = new AdapterPNGtoSVG();
        adapter.getImageCat();
    }
}
