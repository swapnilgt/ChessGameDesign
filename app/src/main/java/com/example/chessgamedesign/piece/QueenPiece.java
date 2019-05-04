package com.example.chessgamedesign.piece;

public class QueenPiece extends Piece {

    public QueenPiece(int currPosX, int currPosY) {
        super(currPosX, currPosY, TYPE_QUEEN);
    }

    @Override
    public boolean canMakeMove(int x, int y) {
        return false;
    }
}
