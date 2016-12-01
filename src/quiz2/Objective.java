/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Usuario9
 */
public class Objective {
    private int x;
    private int y;
    private Image tileset;
    private int numImage;
    public Objective(int x, int y) {
        this.x = x;
        this.y = y;
        this.numImage =0;
         this.tileset = loadImage("FullCoins.png");
    }
    
    public Objective(){
       this.x=20;
       this.y=20;
    }
    
    public void dibujar(Graphics g, JPanel panel){
       g.setColor(Color.red);
       g.drawImage(tileset, x, y, x+60, y+60, 0, 0, 16,16, panel);
    
    }
    
    
    protected Image loadImage(String imageName) {
       ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
         return image;
    }
   public Rectangle obtenerRectangulo(){
       return new Rectangle(x, y, 60, 60);
    }
    
}
