package com.sgq.util;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Author : sgq
 * Date : 2020/11/30 21:03
 */
public class MusicPlayer {
    private static String rd_path="u";
    static {
        if( MyDistance.getRandom(10)%2==0){
            rd_path="iu";
        }
    }

    public static void play() throws FileNotFoundException, JavaLayerException {
        File file=new File("resources\\music\\"+rd_path+".mp3");
        FileInputStream stream=new FileInputStream(file);
        Player player=new Player(stream);
        while (true)
        player.play();
    }


}
