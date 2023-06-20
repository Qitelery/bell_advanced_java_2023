package com.example.demo;

import com.example.demo.actions.Culc;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.Scanner;
@ComponentScan("com.example.demo")
public class Application {

    public static void main (String[] args){
        Culc culc = new Culc();
        culc.culcMap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        Integer x = sc.nextInt();
        System.out.print("Input 2nd number: ");
        Integer y = sc.nextInt();
        System.out.print("Input operation: ");
        String znak = sc.next();
        culc.operations.get(znak).operation(x,y);
    }
}
