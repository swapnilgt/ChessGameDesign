package com.example.chessgamedesign.piece;

public class KingPiece extends Piece {

    public KingPiece(int currPosX, int currPosY) {
        super(currPosX, currPosY, TYPE_KING);
    }

    @Override
    public boolean canMakeMove(int x, int y) {
        return false;
    }
}
