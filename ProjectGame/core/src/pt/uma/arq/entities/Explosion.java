package pt.uma.arq.entities;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class Explosion {
    private SpriteBatch batch;
    private Animator animator;
    private int x,y;
    private boolean show=false;
    //GETs & SETs
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean getShow(){
        return show;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setShow(boolean show) {
        this.show = show;
    }
    /**
     * Construtor
     * recebe x e y para criar a explosão na posição da nave destruida
     * @param batch
     * @param x
     * @param y
     */
    public Explosion(SpriteBatch batch, int x, int y){
        this.batch = batch;
        this.animator=new Animator(batch, "explosion.png",5,1);
        this.x=x;
        this.y=y;
    }

    /**
     * Create serve para a animação
     */
    public void create(){
        this.animator.create();
    }

    /**
     * Render está sempre a ser atualizado:
     *  a variavel show começa a false e só passará a true quando houver a colisão (Class Fleet?)
     */
    public void render(){
        if(this.show){
            this.animator.render(this.x,this.y);
        }
    }
}
