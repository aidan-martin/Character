/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author aidanmartin
 */
public class Mareep {
    
    Color CREAM = new Color(250, 241, 210);
    Color SHADOW = new Color(212, 202, 169);
    
//    Graphics2D g2d = (Graphics 2D) graphics;
//    g2d.rotate(Math.toRadians(45));
//    g2d.fillOval(x + (widht * 10 / 100), y + (height * 20 / 100), width / 2, height / 2);
//    g2d.rotate(Math.toRadians(-45));
//    
//    graphics.setColor(Color.BLACK);
    
    
    
    public void draw(Graphics graphics){
    
    //    tilted eye
        
//    Graphics2D g2d = (Graphics2D) graphics;
//    g2d.rotate(Math.toRadians(45));
//    g2d.fillOval(x + 150, y - 200, width / 2, height / 2);
//    g2d.rotate(Math.toRadians(-45));
//    
//    graphics.setColor(Color.BLACK);
//    graphics.fillOval(x + (width * 10 / 100), y + (height * 20 / 100), width / 2, height / 2);
        
//        int[] xS = new int[3];
//        xS[0] = x + (width / 2);
//        xS[1] = x;
//        xS[2] = x + width;
//        
//        int[] yS = new int[3];
//        yS[0] = y;
//        yS[1] = y + (height * 2 / 3);
//        yS[2] = y + (height);
//        
//        graphics.fillPolygon(xS, yS, 3);
        
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, width, height);
        
        //fluffy bits
      
        graphics.setColor(SHADOW);
        graphics.fillOval(x, y + (height * 55 / 100), width * 10 / 100, height * 10 / 100);
        graphics.fillOval(x + (width * 5 / 100), y + (height * 58 / 100), width * 15 / 100, height * 15 /100);
        graphics.fillOval(x + (width * 8 / 100), y + (height * 55 / 100), width * 15 /100, height * 15 /100);
        graphics.fillOval(x + (width * 13 / 100), y + (height * 56 / 100), width * 20 / 100, height * 20 / 100);

        graphics.setColor(CREAM);
        graphics.fillOval(x, y + (height * 40 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 30 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 20 / 100), y + (height * 25 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 15 / 100), y + (height * 40 / 100), width * 20 / 100, height * 20 / 100);
        
        // outlines
        graphics.setColor(Color.BLACK);
        graphics.drawArc(x, y + (height * 40 / 100), width * 20 / 100, height * 20 / 100, 80, 180);
        graphics.drawArc(x, y + (height * 55 / 100), width * 10 / 100, height * 10 / 100, 120, 130);
//        graphics.drawa
        
        //eyes
        
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 60 / 100), y + (height * 30 / 100), (width * 5 / 100), (height * 5 / 100));
        graphics.fillOval(x + (width * 45 / 100), y + (height * 28 / 100) , (width * 3 / 100), (height * 5 / 100));
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 608 / 1000), y + (height * 30 / 100), (width * 26 / 1000), (height * 26 / 1000));
        graphics.fillOval(x + (width * 455 / 1000), y + (height * 283 / 1000), (width * 2 / 100), (height * 2 / 100));
//        graphics.fillOval(502, 202, 9, 9);
//        graphics.fillOval(444, 199, 7, 9);
//        
        //tail
        
//        graphics.setColor(new Color(237, 161, 55));
//        graphics.fillOval(300, 100, 47, 48);
//        graphics.setColor(new Color(0, 0, 0, 50));
//        graphics.fillOval(307, 109, 35, 36);
//        graphics.setColor(new Color(255, 255, 255));
//        graphics.fillOval(310, 103, 14, 14);
//        graphics.setColor(new Color(255, 255, 255, 99));
//        graphics.fillOval(303, 120, 6, 8);
        
        
        
    }
    
    public Mareep(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
    
    private int x;
    private int y;
    private int height;
    private int width;

    
    }
    

