/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;


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
import quiz2.Enemy;
import quiz2.Hero;
import quiz2.Hero;
import quiz2.Objective;
import quiz2.Obstacle;


/**
 *
 * @author Usuario9
 */
public class Quiz2 extends JPanel implements ActionListener, KeyListener{
    
    

    

       
    
    private Timer timer; 
    private ArrayList<Obstacle> O;
    private ArrayList<Obstacle> borde;
    private ArrayList<Objective> jec;
    public Enemy enn = new Enemy(100,200);
    private Hero personajePrincipal;
   
    private int puntaje = 0;
   public Quiz2(){
       
   }
    public Quiz2(int tatay,int tatax){
        
        
        
            this.setFocusable(true);
            this.addKeyListener(this);
            this.personajePrincipal = new Hero(120,300);
           
            
            this.O = new ArrayList<Obstacle>();
            this.O.add(new Obstacle(60,60));
            this.O.add(new Obstacle(300,360));
            this.O.add(new Obstacle(360,420));
            
            this.borde = new ArrayList<Obstacle>();
            
                  int p=0;
            while(p<tatax){
            this.borde.add(new Obstacle(p*60,0));
            this.borde.add(new Obstacle(p*60,tatay*60));
            p++;
            }
            int k=0;
            while(k<tatay){
            this.borde.add(new Obstacle(0,k*60));
            this.borde.add(new Obstacle(tatax*60,k*60));  
             k++;
            }
             this.borde.add(new Obstacle(tatax*60,tatay*60));
       
            
            this.jec = new ArrayList<Objective>();
            this.jec.add(new Objective(0,0));
            this.jec.add(new Objective(0,120));
            this.jec.add(new Objective(300,0));
            
         
            
            this.timer = new Timer(50, this);
            this.timer.start();
       
        
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.personajePrincipal.dibujar(g,this);
        this.enn.dibujar(g,this);
        for(Obstacle Oa: this.O)
            Oa.dibujar(g,this);
        
        for(Obstacle zz: this.borde)
            zz.dibujar(g,this);
        
        for(Objective j: this.jec)
            j.dibujar(g,this);
        
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
        
      
       validarColisiones();
       repaint();
        //enn.mover();
    }
    public void validarColisiones(){
        Rectangle recPersonaje= this.personajePrincipal.obtenerRectangulo();
        ArrayList<Objective> copia = (ArrayList<Objective>) this.jec.clone();
        for(Objective c : jec){
           Rectangle RecCir = c.obtenerRectangulo();
           if(recPersonaje.intersects(RecCir)){
               copia.remove(c);
               this.puntaje++;
           }
           this.jec=copia;   
           
        }
    }
}