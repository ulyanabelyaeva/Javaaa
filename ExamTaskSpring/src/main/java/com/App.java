package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 21. Реализовать класс PhoneDAO (используйте SpringData JPA)
 * a. Создать класс PhoneDAO.
 * b. Реализовать метод Phone findEntityById(int id) в классе PhoneDAO, который позволяет найти объект в БД по его id.
 * c. Реализовать метод List<Phone> findAll(), который возвращает все телефоны из БД.
 * d. Реализовать метод boolean delete(int id), который удаляет телефон из БД по его id.
 * e. Реализовать метод boolean delete(Phone phone), который удаляет телефон из БД по его id.
 * f. Реализовать метод boolean create(Phone phone), который добавляет новый телефон в БД.
 * g. Реализовать метод Phone update(Phone phone), который обновляет существующий телефон в БД.
 * */

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
