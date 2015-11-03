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
    Color tailOrange = new Color(237, 161, 55);
    
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
//        graphics.fillOval

        graphics.setColor(CREAM);
        graphics.fillOval(x, y + (height * 40 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 30 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 20 / 100), y + (height * 25 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 15 / 100), y + (height * 40 / 100), width * 20 / 100, height * 20 / 100);
        
        // outlines - shadow
        graphics.setColor(Color.BLACK);
        graphics.drawArc(x, y + (height * 55 / 100), width * 10 / 100, height * 10 / 100, 130, 140);
        graphics.drawArc(x + (width * 5 / 100), y + (height * 58 / 100), width * 15 / 100, height * 15 /100, 160, 130);
        graphics.drawArc(x + (width * 13 / 100), y + (height * 56 / 100), width * 20 / 100, height * 20 / 100, 160, 160);
        graphics.drawArc(x + (width * 110 / 1000), y + (height * 62 / 100), width * 5 / 100, height * 5 / 100, 150, 105);


        //outlines - cream
        graphics.setColor(Color.BLACK);
        graphics.drawArc(x, y + (height * 40 / 100), width * 20 / 100, height * 20 / 100, 90, 150);
        graphics.drawArc(x + (width * 10 / 100), y + (height * 30 / 100), width * 20 / 100, height * 20 / 100, 83, 110);
        graphics.drawArc(x + (width * 20 / 100), y + (height * 25 / 100), width * 20 / 100, height * 20 / 100, 90, 110);

        //face
        graphics.drawArc(x + (width * 41 / 100), y + (height * 17 / 100), width * 28 / 100, height * 30 / 100, 137, 110);
        graphics.drawArc(x + (width * 30 / 100), y + (height * 98 / 1000), width * 40 / 100, height * 36 / 100, 269, 80);
        
        //eyes 
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 55 / 100), y + (height * 29 / 100), (width * 5 / 100), (height * 5 / 100));
        graphics.fillOval(x + (width * 40 / 100), y + (height * 28 / 100) , (width * 3 / 100), (height * 5 / 100));
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 558 / 1000), y + (height * 297 / 1000), (width * 26 / 1000), (height * 26 / 1000));
        graphics.fillOval(x + (width * 405 / 1000), y + (height * 283 / 1000), (width * 2 / 100), (height * 2 / 100));
       
        //tail
        
        graphics.setColor(tailOrange);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 4 / 100), (width * 10 / 100), (height * 10 / 100));
        graphics.setColor(Color.black);
        graphics.drawOval(x + (width * 10 / 100), y + (height * 4 / 100), (width * 10 / 100), (height * 10 / 100));
        graphics.setColor(new Color(0, 0, 0, 50));
        graphics.fillOval(x + (width * 115 / 1000), y + (height * 64 / 1000), (width * 7 / 100), (height * 7 / 100));
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 125 / 1000), y + (height * 46 / 1000), (width * 31 / 1000), (height * 31 / 1000));
        graphics.fillOval(x + (width * 107 / 1000), y + (height * 83 / 1000), (width * 17 / 1000), (height * 17 / 1000));       
        
        
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
    

