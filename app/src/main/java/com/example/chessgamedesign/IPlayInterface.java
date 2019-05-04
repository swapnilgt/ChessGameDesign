package com.example.chessgamedesign;

/**
 * This is the interface using which the UI interacts with our game logic.
 */
public interface IPlayInterface {

    void startGame();

    void moveFromTo(int x1, int y1, int x2, int y2);

    void resetGame();
}
