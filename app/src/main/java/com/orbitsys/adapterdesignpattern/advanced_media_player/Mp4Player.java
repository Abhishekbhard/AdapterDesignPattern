package com.orbitsys.adapterdesignpattern.advanced_media_player;

import android.util.Log;

public class Mp4Player implements AdvancedMediaPlayer {
    public static final String TAG="Mp4Player";
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        Log.d(TAG, "Playing mp4 file Name: "+fileName);

    }
}
