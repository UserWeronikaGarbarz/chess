package com.company;

public interface Piece {
    boolean killed = false;
    boolean white = false;

    boolean isWhite();

    void setWhite(boolean white);

    boolean isKilled();

    void setKilled(boolean killed);

    boolean canMove(Board board,
                    Spot start, Spot end);

}
