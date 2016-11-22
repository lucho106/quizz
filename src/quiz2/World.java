/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class World {
    
    private int number, width, height;
    private ArrayList<Enemy> enemies;
    private ArrayList<Objective> objects;
    private ArrayList<Obstacle> obstacles;

    public World() {
        this.enemies = new ArrayList<>();
        this.objects = new ArrayList<>();
        this.obstacles = new ArrayList<>();
    }
    
}
