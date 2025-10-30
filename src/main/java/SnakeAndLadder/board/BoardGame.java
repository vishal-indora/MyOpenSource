package SnakeAndLadder.board;

public abstract class BoardGame {
    private int rows;
    private int cols;

    BoardGame(int r, int c) {
        rows = r;
        cols = c;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
