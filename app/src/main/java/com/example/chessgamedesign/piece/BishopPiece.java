package com.example.chessgamedesign.piece;

public class BishopPiece extends Piece {

    public BishopPiece(int currPosX, int currPosY) {
        super(currPosX, currPosY, TYPE_BISHOP);
    }

    @Override
    public boolean canMakeMove(int x, int y) {
        return false;
    }
}
