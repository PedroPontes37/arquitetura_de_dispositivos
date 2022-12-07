package pt.uma.arq.entities;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public abstract class Ship {
    protected Animator animator;
    protected int x, y, damage;
    protected Laser laser;
    protected Rectangle boundingBox;

    //GETs e SETs
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Rectangle getBoundingBox() {
        return boundingBox;
    }
    public int getDamage() {
        return damage;
    }
    public Laser getLaser() { return laser; }
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    /**
     * Animator apenas serve para fazer as imagens irem alternando para gerar uma animação.
     * O create "ativa" o animator.
     */
    public void create(){
        this.animator.create();
    }
    public abstract void render();
    public abstract void shoot();
}
