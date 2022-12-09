package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class Boom {

    private SpriteBatch batch;
    private Animator animator;

    private int contador;

    private Music explosion;

    private boolean show=false;

    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public int getContador() {
        return contador;
    }

    public Boom(SpriteBatch batch, int x, int y){
        this.x=x;
        this.y=y;
        this.batch=batch;
        this.animator=new Animator(batch,"explosion.png",5,1);
        this.contador=0;
        this.explosion=Gdx.audio.newMusic(Gdx.files.internal("explosion.mp3"));
    }

    public void updtateContador() {
        this.contador++;
    }

    public void create(){this.animator.create();}

    public void render(){
        if(this.show){
            this.animator.render(this.x,this.y);
            explosion.setVolume(1.0f);
            explosion.setLooping(false);
            explosion.play();
            updtateContador();
        }

    }


}
