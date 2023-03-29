/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import pkg2dgamesframework.AFrameOnImage;
import pkg2dgamesframework.Animation;
import pkg2dgamesframework.GameScreen;

/**
 *
 * @author DELL E5470
 */
public class gamebirds extends GameScreen {
    private BufferedImage birds;
    private Animation bird_animation;
    public gamebirds(){
        super(800,600);
        
        try {
            birds =ImageIO.read(new File("anh/bird_sprite.png"));
                    
        } catch (IOException ex){}
        bird_animation = new Animation(100);
        AFrameOnImage f;
        f = new AFrameOnImage(0, 0, 60, 60);
        bird_animation.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_animation.AddFrame(f);
        f = new AFrameOnImage(120, 0, 60, 60);
        bird_animation.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_animation.AddFrame(f);
 
       
  
        BeginGame();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new gamebirds();
    }
    @Override
    public void GAME_UPDATE(long deltaTime) {
        bird_animation.Update_Me(deltaTime);
    }

    @Override
    public void GAME_PAINT(Graphics2D g2) {
        bird_animation.PaintAnims(300, 250, birds, g2, 0, 0);

    }

    @Override
    public void KEY_ACTION(KeyEvent e, int Event) {
    }
    
}
