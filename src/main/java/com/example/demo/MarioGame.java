package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
public class MarioGame implements gamingConsole {

    @Override
    public void moveup() {
        System.out.println("M up");
    }

    @Override
    public void movedown() {
        System.out.println("M down");
    }

    @Override
    public void moveleft() {
        System.out.println("M left");
    }

    @Override
    public void moveright() {
        System.out.println("M right");
    }
}
