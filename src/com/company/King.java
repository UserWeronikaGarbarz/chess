package com.company;

public class King implements Piece {
    private boolean castlingDone = false;

    @Override
    public boolean isWhite() {
        return false;
    }

    @Override
    public void setWhite(boolean white) {

    }

    @Override
    public boolean isKilled() {
        return false;
    }

    @Override
    public void setKilled(boolean killed) {

    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }

    public boolean isCastlingDone() {
        return this.castlingDone;
    }

    public void setCastlingDone(boolean castlingDone) {
        this.castlingDone = castlingDone;
    }

    private boolean isValidCastling(Board board,
                                    Spot start, Spot end) {
        return false;
    }
}
