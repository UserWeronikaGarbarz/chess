package com.company;

public class HumanPlayer implements Player {
    @Override
    public boolean isWhiteSide() {
        return false;
    }

    @Override
    public boolean isHumanPlayer() {
        return false;
    }
}
