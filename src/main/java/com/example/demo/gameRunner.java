package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class gameRunner {
    @Autowired
    gamingConsole game;
    public gameRunner(gamingConsole game){
        this.game = game;
    }
    public void run(){
        game.moveup();
        game.movedown();
        game.moveleft();
        game.moveright();
    }
}
