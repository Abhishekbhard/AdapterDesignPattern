package com.orbitsys.adapterdesignpattern.media_adapter;

import com.orbitsys.adapterdesignpattern.MediaPlayer;
import com.orbitsys.adapterdesignpattern.advanced_media_player.AdvancedMediaPlayer;
import com.orbitsys.adapterdesignpattern.advanced_media_player.Mp4Player;
import com.orbitsys.adapterdesignpattern.advanced_media_player.VlcPlayer;

public class MediaAdapter  implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

   /* public MediaAdapter(String audioType){
        *//*if(audioType.equalsIgnoreCase("vlc")){
        }else if(audioType.equalsIgnoreCase("mp4")){
        }*//*

    }*/

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer=new VlcPlayer();

            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer=new Mp4Player();

            advancedMusicPlayer.playMp4(fileName);
        }

    }
}
