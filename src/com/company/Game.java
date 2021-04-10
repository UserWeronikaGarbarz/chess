package com.company;

import java.util.List;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    private void initialize(Player p1, Player p2) {

    }

    public boolean isEnd() {
        return false;
    }

    public boolean getStatus() {
        return false;
    }

    public void setStatus(GameStatus status) {

    }

    public boolean playerMove(Player player, int startX,
                              int startY, int endX, int endY) {
        return false;
    }

    private boolean makeMove(Move move, Player player) {
        return false;
    }
}
