package Q1;

public class Roomba implements iRobot {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public int[][] room;
    Direction dir;
    int row = 0;
    int col = 0;

    public Roomba(int[][] room) {
        this.room = room;
        dir = Direction.DOWN;
    }



    @Override
    public boolean move() {
        if (dir == Direction.DOWN){
            if (inRange(row-1,col) && room[row+1][col] != -1) return true;
         }
        if (dir == Direction.LEFT) {
            if (inRange(row, col-1) && room[row][col-1] != -1) return true;
        }
        if (dir == Direction.UP) {
            if (inRange(row-1,col) && room[row -1][col] != -1) return true;
        }
        if (dir == Direction.RIGHT) {
            if (inRange(row,col+1) && room[row][col+1] != -1) return true;
        }
        return false;
    }
    public boolean inRange(int row, int col){
        if (row > 0 && row < room.length && col > 0 && room[row].length < col) return true;
        return false;
    }

    @Override
    public void turnLeft() {
        if (dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.LEFT ) {
            dir = Direction.UP;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        } else {
            dir = Direction.LEFT;
        }
    }

    @Override
    public void turnRight() {
        ;if (dir == Direction.DOWN) {
            dir = Direction.LEFT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.UP;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        } else {
            dir = Direction.RIGHT;
        }
    }

    @Override
    public void clean() {
        if (room[row][col] == 0) {
            room[row][col] = 1;
        }

    }
}
