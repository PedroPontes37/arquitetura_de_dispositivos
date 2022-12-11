package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class Boom implements PlayMusic {
    private SpriteBatch batch;
    private Animator animator;

    private int contador;

    private Music explosion;

    private boolean show=false;

    private int x, y;

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

    public void updateContador() {
        this.contador++;
    }

    public void create(){this.animator.create();}

    public void render(){
        if(this.show){
            this.animator.render(this.x,this.y);
            playMusic(explosion,1.0f,false);
            updateContador();
        }

    }
    @Override
    public void playMusic(Music music, float volume, boolean loop) {
        music.setVolume(volume);
        music.setLooping(loop);
        music.play();
    }
}
