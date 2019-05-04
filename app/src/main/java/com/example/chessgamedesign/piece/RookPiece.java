package com.example.chessgamedesign.piece;

public class RookPiece extends Piece {

    public RookPiece(int currPosX, int currPosY) {
        super(currPosX, currPosY, TYPE_ROOK);
    }

    @Override
    public boolean canMakeMove(int x, int y) {
        return false;
    }
}
