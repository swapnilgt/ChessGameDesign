package com.example.chessgamedesign;

public interface IViewInterface {

    /**
     * Send a move event from the game to the UI.
     * @param move
     */
    void sendMove(PlayerMove move);

    /**
     * Used to build the UI again from a saved game state.
     * @param savedGameState
     */
    void buildUIFromGame(Game savedGameState, int colorFirst, int colorSecond);

}
