package com.example.chessgamedesign.piece;

public class PawnPiece extends Piece {

    public PawnPiece(int currPosX, int currPosY) {
        super(currPosX, currPosY, TYPE_PAWN);
    }

    @Override
    public boolean canMakeMove(int x, int y) {
        // Logic to see if the piece can move to the target piece ..

        return false;
    }
}
