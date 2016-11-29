/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import GUICreacionJuego.Ventana1;
import GUICreacionJuego.mxy;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.Timer;
import quiz2.Hero;

/**
 *
 * @author Usuario9
 */
public class Quiz2 extends JPanel implements ActionListener, KeyListener{
    Ventana1 zzzz = new Ventana1();
    private Timer timer; 
    
    private Hero personajePrincipal;
    
    private int puntaje = 0;
   
    public Quiz2(){
        
            this.setFocusable(true);
            this.addKeyListener(this);
            this.personajePrincipal = new Hero(zzzz.getHx()*60,zzzz.getHy()*60);
          System.out.println((zzzz.getHx()));
           
            
            
         
            
            this.timer = new Timer(50, this);
            this.timer.start();
       
        
    }
    protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         this.personajePrincipal.dibujar(g,this);

    
    
    
           
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo=-1;
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            codigo=1;
        }

        if (key == KeyEvent.VK_LEFT) {
            codigo=1;
        }

        if (key == KeyEvent.VK_RIGHT) {
           codigo=2;
        }

        if (key == KeyEvent.VK_UP) {
           codigo=3;
        }

        if (key == KeyEvent.VK_DOWN) {
           codigo=4;
        }
        
         this.personajePrincipal.keyPressed(e);
         
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       repaint();
    }
}