package SnakeAndLadder.player;

import SnakeAndLadder.board.Cell;

public class HumanPlayer implements Player{

    private Cell currentPos;

    public HumanPlayer() {
        this.currentPos = new Cell(0); // starting position for new player
    }

    public Cell getCurrentPos() {
        return currentPos;
    }

    @Override
    public Cell getNextPos() {
        return this.currentPos.getNextCell();
    }

    public boolean setNextPosition(Cell cell) {
        currentPos = cell;
        return true;
    }
}
