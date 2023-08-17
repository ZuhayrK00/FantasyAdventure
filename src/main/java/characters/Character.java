package characters;

import behaviours.IWeapon;

public abstract class Character {


    protected int health;


    protected String name;

    public void takeDamage(int value) {
        health -= value;
    };

    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
}
