package com.example.demo.actions;

import com.example.demo.Application;
import com.example.demo.opers.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

public class Culc {
    public static HashMap<String, Oper> operations = new HashMap<>();
    public void culcMap (){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Sum summa = context.getBean("summa", Sum.class);
        operations.put("+", summa);

        Delenie del = context.getBean("del", Delenie.class);
        operations.put("/", del);

        Minus min = context.getBean("minus", Minus.class);
        operations.put("-", min);

        Multi multi = context.getBean("multi", Multi.class);
        operations.put("*", multi);
    }
}
