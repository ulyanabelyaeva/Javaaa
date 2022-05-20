package com;

import com.config.BeanConfig;
import com.entity.Knight;
import com.entity.StrongKnight;
import com.entity.WeakKnight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.entity");

        StrongKnight strongKnight = context.getBean(StrongKnight.class);
        strongKnight.fight();

        WeakKnight weakKnight = context.getBean(WeakKnight.class);
        weakKnight.fight();
    }
}
