package SnakeAndLadder.board;

import SnakeAndLadder.obstacle.Obstacle;

import java.util.ArrayList;
import java.util.List;

public class Board extends BoardGame{

    private List<Obstacle> obstacles;

    public Board(int r, int c) {
        super(r, c);
        obstacles = new ArrayList<>();
    }

    public boolean addObstacle(Obstacle obs) {
        obstacles.add(obs);
        return true;
    }

    // i have the board with snakes and ladders defined

}
