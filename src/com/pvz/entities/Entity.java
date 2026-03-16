package com.pvz.entities;

public abstract class Entity {
    protected int x;
    protected int y;
    protected int health;

    public Entity(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }

    public abstract void update();

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}