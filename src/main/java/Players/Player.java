package Players;

public abstract class Player implements ITakeDamage{

    private String name;
    private int hp;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String takeDamage(int damage){
        hp = hp - damage;
        return "Ah ya bastard!";
    }
}
