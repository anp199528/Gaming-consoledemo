package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SuperContra implements gamingConsole{
    @Override
    public void moveup() {
        System.out.println("Super Contra up");
    }

    @Override
    public void movedown() {
        System.out.println("Super Contra down");
    }

    @Override
    public void moveleft() {
        System.out.println("Super Contra left");
    }

    @Override
    public void moveright() {
        System.out.println("Super Contra right");
    }
}
