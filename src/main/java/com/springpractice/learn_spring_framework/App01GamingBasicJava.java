package com.springpractice.learn_spring_framework;

import game.GameRunner;
import game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] main){
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
