package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(DemoApplication.class, args);
//        gamingConsole game = new MarioGame();
//        gameRunner runner=new gameRunner(game);
//        runner.run();
        gameRunner runner = context.getBean(gameRunner.class);
        runner.run();
    }


}
