package Enemies;

public abstract class Enemy {

    private String name;

    public Enemy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
