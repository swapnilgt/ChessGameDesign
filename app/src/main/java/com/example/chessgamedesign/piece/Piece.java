package com.example.chessgamedesign.piece;

public abstract class Piece {

    private int currPosX, currPosY;
    private boolean isAlive;
    private int mType;

    public static final int TYPE_PAWN = 0;
    public static final int TYPE_KNIGHT = 1;
    public static final int TYPE_KING = 2;
    public static final int TYPE_QUEEN = 3;
    public static final int TYPE_BISHOP = 4;
    public static final int TYPE_ROOK = 3;

    public Piece(int currPosX, int currPosY, int mType) {
        this.currPosX = currPosX;
        this.currPosY = currPosY;
        this.mType = mType;
        this.isAlive = true;
    }

    public void moveTo(int x, int y) {
        // Up date the current position of the piece ...
    }

    public abstract boolean canMakeMove(int x, int y);
}
