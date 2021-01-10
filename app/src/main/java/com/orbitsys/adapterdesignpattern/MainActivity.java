package com.orbitsys.adapterdesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.orbitsys.adapterdesignpattern.audio_player.AudioPlayer;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "@@@";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //5*4*3*2*1;
        setContentView(R.layout.activity_main);
        /*AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","Beyond the horizon mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mind me.avi");*/
        Log.d(TAG, "Factorial: Iteration " + getFactorialLoop(5));
        Log.d(TAG, "Factorial Recursion: " + getFactorialRecursion(5));

    }

    private int getFactorialRecursion(int n){

        if(n==1){
            return 1;
        }else {
            return n*getFactorialRecursion(n-1);
        }
    }
    private int getFactorialLoop(int n) {
        int r = 1;
        for (int i = n; i > 0; --i) {
            r = r * i;
        }

        return r;
    }


}