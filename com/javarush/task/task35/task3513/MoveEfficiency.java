package com.javarush.task.task35.task3513;

public class MoveEfficiency implements Comparable<MoveEfficiency> {
    private Move move;
    private  int numberOfEmptyTiles;
    private int score;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.move = move;
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
    }

    public Move getMove() {
        return move;
    }

    @Override
    public int compareTo(MoveEfficiency o) {
        if (this.numberOfEmptyTiles > o.numberOfEmptyTiles) return 1;
        if (this.numberOfEmptyTiles < o.numberOfEmptyTiles) return -1;
        if (this.numberOfEmptyTiles == o.numberOfEmptyTiles) {
            if (this.score > o.score) return 1;
            if (this.score < o.score) return -1;
        }
      return 0;
    }
}
