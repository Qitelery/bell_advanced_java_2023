package com.example.demo.opers;
import lombok.*;

public interface Oper {
    /*int x;
    int y;
    float res;
    String name;*/

    float operation(int x, int y);

    void info(int x, int y, float res);
    /*{
        System.out.println(
                String.format(
                        "%s %d and %d = %2f",
                        name,
                        x,
                        y,
                        res
                )
        );
    }*/
}
