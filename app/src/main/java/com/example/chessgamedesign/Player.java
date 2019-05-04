package com.example.chessgamedesign;

import com.example.chessgamedesign.piece.Piece;

import org.json.JSONObject;

import java.util.Map;

/**
 * This class stores all the information related to a player.
 */
public class Player {

    public static final int TYPE_FIRST = 0;
    public static final int TYPE_SECOND = 1;

    /**
     * Either the first player or the seconds player ...
     */
    private int mType;

    /**
     * This stores the Pieces in the respective keys (combination of current 'x'_'y' position of the Piece)
     */
    private Map<String, Piece> mIdPieceMap;

    public Player(int mType) {
        this.mType = mType;
        initializeData();
    }

    /**
     * This is used when we need to build the UI state from scratch ...
     * Can be while first initializing the Game or restoring it from the creash ..
     */
    public Map<String, Piece> getmIdPieceMap() {
        return mIdPieceMap;
    }

    /**
     * This constructor is used to restore the state of a player if the app crashes in between.
     * @param mType 0 or 1
     * @param obj The json data storing the state of the pieces of the user.
     */
    public Player(int mType, JSONObject obj) {
        this.mType = mType;
        loadData(obj);

    }

    /**
     * This actually reads the json data and then loads it into mIdPieceMap when the data is recovered for an intermediate state.
     * @param obj
     */
    private void loadData(JSONObject obj) {

    }

    private void initializeData() {

        // Here is the code to initialize the mIdPieceMap for this player.
        // Depends if the player is of type 0 or 1.
    }

    public void reset() {
        // Resets the pawn position and other data related to the player ...
    }

    /**
     * This function returns if the player has a piece in the given position.
     * @param x The x corrdinate on the chess board.
     * @param y The y coordinate on the chess board.
     * @return If the player has a piece at (x, y) on the chessboard.
     */
    private boolean hasPiece(int x, int y) {

        return false;
    }

    /**
     * Try to move the piece from (x1, y1) -> (x2, y2)
     * @return if the movement was a success or not.
     */
    public boolean moveFromTo(int x1, int y1, int x2, int y2) {

        // user hasPiece here first ..
        return false;
    }

    /**
     * Returns true if we are able to find and kill a piece at (x1, y1) for this player as the target player.
     * a) First we check hasPiece(x1, y1)
     * b) And then we kill the piece based on the condition if a exists there or not.
     * @param x1
     * @param y1
     * @return true or false
     */
    public boolean tryKillingPiece(int x1, int y1) {
        return false;
    }


}
