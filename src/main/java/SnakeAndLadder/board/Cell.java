package SnakeAndLadder.board;

import SnakeAndLadder.obstacle.ObstacleType;

public class Cell {
    private int cellNo;
    private boolean isSnake;
    private boolean isLadder;

    private Cell endCell;

    public Cell(int cellNo) {
        this.cellNo = cellNo;
        isLadder = false;
        isSnake = false;
    }

    public int getCellNo() {
        return cellNo;
    }

    public boolean isSnake() {
        return isSnake;
    }

    public boolean isLadder() {
        return isLadder;
    }

    public void setObstacle(Cell endCell, ObstacleType type) {
        this.endCell = endCell;
        if (type == ObstacleType.LADDER) isLadder = true;
        else if (type == ObstacleType.SNAKE) isSnake = true;
    }

    public Cell getNextCell() {
        if(!isSnake || !isLadder || endCell == null) return this;

        return endCell;
    }
}
