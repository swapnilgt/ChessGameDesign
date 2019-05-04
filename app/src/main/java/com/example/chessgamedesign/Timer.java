package com.example.chessgamedesign;

public class Timer {

    private TimerListener mListener;
    private int loopTime;

    public Timer(int loopTime, TimerListener mListener) {
        this.mListener = mListener;
        this.loopTime = loopTime;
    }

    public void setLoopTime(int loopTime) {
        this.loopTime = loopTime;
    }

    public interface TimerListener {
        void onTimeFinished();
    }
}
