package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class PlayerShip extends Ship {
    private SpriteBatch batch;
    public int x=300, y=100;
    private int life = 100;
    private int points = 0;

    //GETs & SETs
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getLife() {
        return life;
    }
    public int getPoints() {
        return points;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * Construtor
     * @param batch
     * @param boundingBox
     */
    public PlayerShip(SpriteBatch batch,Rectangle boundingBox){
        this.batch = batch;
        this.animator=new Animator(batch, "ship.png",5,2);
        this.boundingBox=boundingBox;
    }

    /**
     * função presente no render, é um funciona como lisener para os inputs do teclado
     * O SPACE poderia estar nesta função mas dessa maneira nao seria possivel disparar e andar ao mesmo tempo
     */
    public void movements(){
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            this.setX(this.getX() - 5);
            if (this.getX()<0){
                this.setX(0);
            }
            this.getBoundingBox().setBounds(this.getX(),this.getY(),40,40);
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            this.setX(this.getX() + 5);
            if(this.getX()>575){
                this.setX(575);
            }
            this.getBoundingBox().setBounds(this.getX(),this.getY(),40,40);
        }
    }

    /**
     * shot() SPACE
     * Movements LEFT/RIGHT
     * Atualiza a posição do jogador
     */
    @Override
    public void render(){
        this.shoot();
        this.animator.render(this.x,this.y);
        this.movements();
        if (this.laser!=null){
            this.laser.render();
        }
    }

    /**
     * SPACE
     * criar nova instancia de Laser
     */
    @Override
    public void shoot() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)){
            if (this.laser!=null){
                if(!this.laser.getShow()){
                    this.laser = new Laser(batch, "laser-bolts.png",this.x, this.y+5,new Rectangle(this.x,this.y+5,animator.getWidth(),animator.getHeight()),10,0);
                    this.laser.create();
                }
            }else {
                this.laser = new Laser(batch, "laser-bolts.png",this.x, this.y+5,new Rectangle(this.x,this.y+5,animator.getWidth(),animator.getHeight()),10,0);
                this.laser.create();
            }
        }
    }
}
