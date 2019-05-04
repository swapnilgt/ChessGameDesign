package com.example.chessgamedesign;

import java.io.File;
import java.util.List;

import static com.example.chessgamedesign.Player.TYPE_FIRST;
import static com.example.chessgamedesign.Player.TYPE_SECOND;

public class Game implements IPlayInterface, Timer.TimerListener {


    private final IViewInterface mView;

    private int colorFirst;
    private int colorSecond;

    private Player player1;
    private Player player2;
    // The player who can currently move the pieces ...
    // We keep on switching this inside togglePlayer();
    private Player currPlayer;

    private Board mBoard;

    /**
     * Sequence of player moves in case we want to provide a replay or undo a move.
     */
    private List<PlayerMove> mPlayerMoves;

    /**
     * The normal constructor for the game ..
     * @param mView The view object ..
     * @param colorFirst first color
     * @param colorSecond seconds color
     */
    public Game(IViewInterface mView, int colorFirst, int colorSecond) {
        this.mView = mView;
        this.colorFirst = colorFirst;
        this.colorSecond = colorSecond;
        player1 = new Player(TYPE_FIRST);
        player2 = new Player(TYPE_SECOND);

        mBoard = new Board(colorFirst, colorSecond);

        // At the end of setting the entire data to the View as well .. we need to call
        this.mView.buildUIFromGame(this, colorFirst, colorSecond);
    }

    private void togglePlayer() {
        // After each chance we set the currPlayer.
    }

    /**
     * This is used to get the player1 data from the View when rebuilding is needed.
     * @return
     */
    public Player getPlayer1() {
        return player1;
    }

    /**
     * This is used to get the player2 data from the View when rebuilding is needed.
     * @return
     */
    public Player getPlayer2() {
        return player2;
    }

    /**
     * This constructor is to restore the game from a stored state in the given file.
     * Things that we have stored are:
     * a) colorFirst, colorSecond
     * b) The data for the pieces of each player.
     *
     * @param stateFile The file that stores the state of the game.
     */
    public Game(IViewInterface mView, File stateFile) {

        this.mView = mView; // This needs to set as usual ...

        // a) Read the colors and set them ..

        // b) Read the piece data for each player and restore using public Player(int mType, JSONObject obj)

        // At the end of setting the entire data to the UI as well .. we need to call
        this.mView.buildUIFromGame(this, colorFirst, colorSecond);

    }

    // Implementation for the actions from the UI ...
    @Override
    public void startGame() {

    }

    @Override
    public void moveFromTo(int x1, int y1, int x2, int y2) {
        // Do all the process .....

        // a) call success1 = player1/2.moveFromTo(x1, y1, x2, y2) from here ...

        // b) call success2 = player2/1.tryKillingPiece(x2, y2) from here ..

        // Create he PlayerMove object based on success1 and success2

        // Enqueue it into mPlayerMoves and probably write to local storage as well ..

    }

    @Override
    public void resetGame() {

    }

    // Method that get a call back from the timer in case, the
    @Override
    public void onTimeFinished() {

    }
}
