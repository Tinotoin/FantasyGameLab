package Rooms;

import Enemies.Enemy;

import java.util.ArrayList;

public class Room {

    private String name;
    private double treasure;
    private ArrayList<Enemy> enemies;

    public Room(String name) {
        this.name = name;
        this.treasure = Math.random() * 100;
        this.enemies = new ArrayList<Enemy>();
    }

    public String getName() {
        return name;
    }

    public double getTreasure() {
        return treasure;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemy enemy){
        this.enemies.add(enemy);
    }

}
