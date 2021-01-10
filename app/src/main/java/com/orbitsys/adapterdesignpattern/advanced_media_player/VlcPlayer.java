package com.orbitsys.adapterdesignpattern.advanced_media_player;

import android.util.Log;

public class VlcPlayer implements AdvancedMediaPlayer {
    public static final String TAG="VlcPlayer";
    @Override
    public void playVlc(String fileName) {
        Log.d(TAG, "Playing Vlc file Name:  "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
