/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.other;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author chathumal
 */
public class mp3play {
    
    FileInputStream fis;
    BufferedInputStream bis;
    
    /**
     *
     */
    public Player player;
    
    public void play(){
        try 
        {
            fis=new FileInputStream("G:\\SMSC Payroll\\src\\sasanga.wav");
            bis=new BufferedInputStream(fis);
            player=new Player(bis); 
        } catch (FileNotFoundException | JavaLayerException ex){
            Logger.getLogger(mp3play.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                    Logger.getLogger(mp3play.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
}
 