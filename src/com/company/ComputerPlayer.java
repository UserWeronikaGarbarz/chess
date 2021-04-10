package com.company;

public class ComputerPlayer implements Player {
    @Override
    public boolean isWhiteSide() {
        return false;
    }

    @Override
    public boolean isHumanPlayer() {
        return false;
    }
}
