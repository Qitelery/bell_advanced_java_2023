package com.example.demo.opers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("summa")
@Scope("singleton")
public class Sum implements Oper {

    public float operation(int x, int y) {
        int res;
        res = x + y;
        info(x, y, res);
        return 0;
    }

    @Override
    public void info(int x, int y, float res) {
        System.out.println(
                String.format(
                        "Summa %d and %d is %2f",
                        x,
                        y,
                        res
                )
        );
    }
}
