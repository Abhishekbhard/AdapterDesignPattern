package com.orbitsys.adapterdesignpattern.audio_player;

import android.util.Log;

import com.orbitsys.adapterdesignpattern.media_adapter.MediaAdapter;
import com.orbitsys.adapterdesignpattern.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    public static final String TAG = "AudioPlayer";
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            Log.d(TAG, "playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);


        } else {
            Log.d(TAG, "Invalid Media" + audioType + " Format not supported " );
        }
    }
}
