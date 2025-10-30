package SnakeAndLadder.player;

import SnakeAndLadder.board.Cell;

public interface Player {
    // i can sort of have any playing strategy
    public Cell getCurrentPos();

    public Cell getNextPos();
}
