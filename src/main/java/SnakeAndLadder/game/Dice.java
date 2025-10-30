package SnakeAndLadder.game;

import java.util.Random;

public class Dice {
    private int diceLen;

    Dice(int len){
        diceLen = len;
    }

    public int rollDice() {
        return (int) (Math.random() % diceLen);
    }
}
