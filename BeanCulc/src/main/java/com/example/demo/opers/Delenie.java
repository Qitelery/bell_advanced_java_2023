package com.example.demo.opers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("del")
@Scope("singleton")
public class Delenie implements Oper{
    @Override
    public float operation(int x, int y) {
        int res;
        res = x/y;
        info(x, y, res);
        return 0;
    }

    @Override
    public void info(int x, int y, float res) {
        System.out.println(
                String.format(
                        "%d / %d = %2f",
                        x,
                        y,
                        res
                )
        );
    }
}
