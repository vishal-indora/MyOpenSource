package SnakeAndLadder.game;

import SnakeAndLadder.board.Board;
import SnakeAndLadder.board.Cell;
import SnakeAndLadder.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Game {
    // snake and ladder game
    private Board board;
    private List<Player> players;

    private Dice dice;

    Game(int r, int c, Dice dice) {
        board = new Board(r, c);
        this.dice = dice;
    }

    public boolean addPlayer(Player player){
        players.add(player);
        return true;
    }


    public void startGame() {
        // infinitely till only one player is left, roll the dice, move to new position, check for winning condition, repeat the same thing for all players
        List<Player> playing = new CopyOnWriteArrayList<>(players);
        while (playing.size() > 1) {
            for(Player player:playing){
                Cell currentPos = player.getCurrentPos();
                int i = this.dice.rollDice();
                //if(currentPos.)
            }
        }
    }

}
