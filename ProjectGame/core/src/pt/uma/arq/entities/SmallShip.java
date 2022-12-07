package pt.uma.arq.entities;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class SmallShip extends Ship{
    private SpriteBatch batch;

    /**
     * Construtor
     *
     * @param batch
     * @param x
     * @param y
     * @param boundingBox
     */
    public SmallShip(SpriteBatch batch,int x, int y, Rectangle boundingBox){
        this.batch=batch;
        this.animator=new Animator(batch, "enemy-small.png",2,1);
        this.x=x;
        this.y=y;
        this.damage=5;
        this.boundingBox=boundingBox;
    }

    /**
     * Vai mostrar o laser caso ele ja nao seja nulo
     * (Ele mudara o seu valor (not null) no shoot() que será chamado por um timer)
     */
    @Override
    public void render() {
        this.getBoundingBox().setBounds(this.x,this.y,animator.getWidth(),animator.getHeight());
        this.animator.render(this.x,this.y);
        if (this.laser!=null){
            this.laser.render();
        }
    }

    /**
     * Inicializar: Mudar o valor do laser(not null) - logo será renderizado
     * Evocar o create do Laser
     */
    @Override
    public void shoot() {
        if (this.laser!=null){
            if(!this.laser.getShow()){
                this.laser=new Laser(batch,"laser-bolts-enemys.png",this.x,y-5,new Rectangle(this.x,this.y-5,animator.getWidth(),animator.getHeight()),-12,0);
                this.laser.create();
            }
        }else {
            this.laser=new Laser(batch,"laser-bolts-enemys.png",this.x,y-5,new Rectangle(this.x,this.y-5,animator.getWidth(),animator.getHeight()),-12,0);
            this.laser.create();
        }
    }
}
