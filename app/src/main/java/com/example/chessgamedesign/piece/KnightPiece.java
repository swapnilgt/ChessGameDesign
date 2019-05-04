package com.example.chessgamedesign.piece;

public class KnightPiece extends Piece {

    public KnightPiece(int currPosX, int currPosY) {
        super(currPosX, currPosY, TYPE_KNIGHT);
    }

    @Override
    public boolean canMakeMove(int x, int y) {
        return false;
    }


}
