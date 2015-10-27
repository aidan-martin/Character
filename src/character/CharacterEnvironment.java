/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author aidanmartin
 */
class CharacterEnvironment extends Environment {
    
    Mareep mareep;
    Image mareepImage;
    
    public CharacterEnvironment() {
        mareep = new Mareep(100, 100, 400, 400);
        mareepImage = ResourceTools.loadImageFromResource("character/mareep.jpg");
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        
        if  (mareep != null){
            mareep.draw(graphics);
            
        }
        
        if (mareepImage != null) {
            graphics.drawImage(mareepImage, 600, 100, 200, 200, this);
        }
        
    }
    
}
