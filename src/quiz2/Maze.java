/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Estudiante
 */
public class Maze extends Game{
    
    private int time;
    private Screen configureScreen;
    private World worlds;
    private Hero heroes; 

    public Maze() {
        this.worlds = new World();
        this.heroes = new Hero();
        this.configureScreen = new Screen();
    }
    
}
