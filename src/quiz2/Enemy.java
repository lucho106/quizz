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
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Personaje principal
 */
public class Enemy {
    private int x;
    private int y;
    private Image tileset;
        
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.tileset = loadImage("im.png");
    }

    public Image getTileset() {
        return tileset;
    }

    public void setTileset(Image tileset) {
        this.tileset = tileset;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Enemy(){
       this.x=0;
       this.y=0;
    }
    public void dibujar(Graphics g, JPanel panel){
       g.setColor(Color.red);
       g.drawImage(tileset, x, y, x+60, y+60, 2*218, 0, 3*218,215, panel);
    }
    
   protected Image loadImage(String imageName) {
       ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
         return image;
    }
    public void move() {
         x =  0;
        if (y > 1000) {
            y = 0;
        }
        y += 1;
    }
    
    
   
    
     public Rectangle obtenerRectangulo(){
       return new Rectangle(x, y, 60, 60);
    }

    void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
