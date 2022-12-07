package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class Laser {
    //Criar uma instancia do tipo Rectangle
    private Rectangle boundingBox;
    private SpriteBatch batch;
    private Animator animator;
    private int x, y=100;
    private boolean show = true;
    private int direction;
    private int angle;

    private Music musicLaser;


    //GETs & SETs
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public boolean getShow(){return this.show;}
    public Rectangle getBoundingBox() {
        return boundingBox;
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
     * Contrutor
     *
     * @param batch
     * @param path  É passado o path pois este construtor vai criar lasers para o player e para os enemys
     * @param x
     * @param y
     * @param boundingBox
     * @param direction Para cima (+) para baixo (-). Quanto maior o valor absoluto mais rapido é o laser
     */
    public Laser(SpriteBatch batch,String path, int x, int y,Rectangle boundingBox,int direction, int angle){
        this.x=x;
        this.y=y;
        this.batch=batch;
        this.animator=new Animator(batch,path,2,1);
        this.boundingBox=boundingBox;
        this.direction=direction;
        this.angle=angle;
        this.musicLaser= Gdx.audio.newMusic(Gdx.files.internal("laserSound.mp3"));
    }

    /**
     * animação do laser
     */
    public void create(){
        this.animator.create();
    }

    /**
     * Objetico: mostrar o laser (em cada frame - movimento do laser)
     * Atualiza o BB do laser
     * Mudar o show para falso IF (SAIR DA TELA)
     * Apenas mostrará se show == true
     */
    public void render(){
        boundingBox.setBounds(x,y,animator.getWidth(),animator.getHeight());
        //Player
        if (this.direction>0){
            if (this.y>800){
               show=false;

                musicLaser.setVolume(0.2f);
                musicLaser.setLooping(false);
                musicLaser.play();
            }
            if (show){
                y+=direction;
                x+=angle;
                musicLaser.setVolume(0.2f);
                musicLaser.setLooping(false);
                musicLaser.play();

                this.animator.render(this.x,this.y);
            }
        //Enemy
        }else{
            if (this.y<0){
                show=false;
            }
            if (show){
                y+=direction;
                x+=angle;
                this.animator.render(this.x,this.y);
            }
        }
    }

}

