/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author aidanmartin
 */
public class Mareep {
    
    Color CREAM = Color.WHITE;
    Color BROWN = Color.YELLOW;
    
    public void draw(Graphics graphics){
        
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
        
        graphics.setColor(Color.RED);
        graphics.drawRect(x, y, width, height);
        
        //fluffy bits

        
        
        graphics.setColor(BROWN);
        graphics.fillOval(x, y + (height * 55 / 100), width * 10 / 100, height * 10 / 100);

        graphics.setColor(CREAM);
        graphics.fillOval(x, y + (height * 40 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 30 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 20 / 100), y + (height * 25 / 100), width * 20 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 15 / 100), y + (height * 45 / 100), width * 20 / 100, height * 20 / 100);
        
        
        
//        graphics.setColor(Color.black);
//        graphics.fillOval(500, 200, 21, 21);
//        graphics.fillOval(440, 198, 14, 21);
//        graphics.setColor(Color.white);
//        graphics.fillOval(502, 202, 9, 9);
//        graphics.fillOval(444, 199, 7, 9);
//        
//        graphics.setColor(new Color(237, 161, 55));
//        graphics.fillOval(300, 100, 47, 48);
//        graphics.setColor(new Color(0, 0, 0, 50));
//        graphics.fillOval(307, 109, 35, 36);
//        graphics.setColor(new Color(255, 255, 255));
//        graphics.fillOval(310, 103, 14, 14);
//        graphics.setColor(new Color(255, 255, 255, 99));
//        graphics.fillOval(303, 120, 6, 8);
//        
//        graphics.drawArc(x, y, width, height, height, height);
        
        
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
