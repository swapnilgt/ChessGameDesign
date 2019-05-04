package com.example.chessgamedesign;

public class PlayerMove {

    public static int EVENT_MOVE = 0;
    public static int EVENT_KILL = 1;

    int actingPlayer; // Either 0 or 1
    int actionType; // EVENT_MOVE or EVENT_KILL
    int actingPlayerParams[]; // array of type [x1, y1, x2, y2] (from where to where)
    int actingPlayerPieceType; // The piece type of the acting player
    int targetPlayerPieceType; // The piece type of the target player (This is set to a valid number if a piece was killed while making this move. Else it is set to -1 by default)

    public PlayerMove(int actingPlayer, int actionType, int[] actingPlayerParams, int actingPlayerPieceType) {
        this.actingPlayer = actingPlayer;
        this.actionType = actionType;
        this.actingPlayerParams = actingPlayerParams;
        this.actingPlayerPieceType = actingPlayerPieceType;
    }

    public PlayerMove(int actingPlayer, int actionType, int[] actingPlayerParams, int actingPlayerPieceType, int targetPlayerPieceType) {
        this.actingPlayer = actingPlayer;
        this.actionType = actionType;
        this.actingPlayerParams = actingPlayerParams;
        this.actingPlayerPieceType = actingPlayerPieceType;
        this.targetPlayerPieceType = targetPlayerPieceType;
    }

    public int getActingPlayer() {
        return actingPlayer;
    }

    public int getActionType() {
        return actionType;
    }

    public int[] getActingPlayerParams() {
        return actingPlayerParams;
    }

    public int getActingPlayerPieceType() {
        return actingPlayerPieceType;
    }

    public int getTargetPlayerPieceType() {
        return targetPlayerPieceType;
    }
}
