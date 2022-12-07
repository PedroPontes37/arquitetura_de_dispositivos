package pt.uma.arq.entities;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Timer;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Fleet {
    private SpriteBatch batch;
    private ArrayList<Ship> fleetOfShips;

    //GET
    public ArrayList<Ship> getFleetOfShips() {
        return fleetOfShips;
    }
    Timer timer;

    /**
     * Construtor
     * @param batch
     */
    public Fleet(SpriteBatch batch){
        this.batch=batch;
        this.fleetOfShips=new ArrayList<Ship>();
        timer =new Timer();
        timer.scheduleTask(new Timer.Task() {
            @Override
            public void run() {
                shoot();
            }
        },2,(float)0.5,-1);
    }

    /**
     * Create serve para a animação
     * Dá a posição inicial dos primeiros de cada tipo de nave inimiga.
     *
     * 8x -----------------------------------------
     * Cria uma instância do tipo de nave
     * Aplica metodo create()
     * Adiciona a nave ao ArrayList fleetOfShips
     * Atualiza a posição da proxima nave
     *---------------------------------------------
     *
     * Ordena por Damage utilizando o FleetComparatorByDamage()
     */
    public void create(){
        int xSmall=140,ySmall=400;
        int xMedium=50,yMedium=470;
        int xLarge=75,yLarge=540;
        for (int i = 0; i < 8; i++) {
            LargeShip largeShip = new LargeShip(batch,xLarge,yLarge,new Rectangle(xLarge,yLarge,0,0));
            largeShip.create();
            fleetOfShips.add(largeShip);
            MediumShip mediumShip = new MediumShip(batch,xMedium,yMedium,new Rectangle(xMedium,yMedium,0,0));
            mediumShip.create();
            fleetOfShips.add(mediumShip);
            SmallShip smallShip = new SmallShip(batch,xSmall,ySmall,new Rectangle(xSmall,ySmall,0,0));
            smallShip.create();
            fleetOfShips.add(smallShip);
            xSmall+=45;
            xMedium+=68;
            xLarge+=65;
        }
        Collections.sort(fleetOfShips, new FleetComparatorByDamage());
    }

    /**
     * Player atacks Ship
     * Faz o laser do player passar para false
     * Faz a Ship ser removida
     * @param player
     */
    public void handleCollisionsPtoS(PlayerShip player){
        Iterator<Ship> iterator=fleetOfShips.iterator();
        fleetOfShips.iterator();
        while (iterator.hasNext()){
            Ship ship = iterator.next();
            if(ship.getBoundingBox().intersects(player.getLaser().getBoundingBox())){
                player.setPoints(player.getPoints()+(ship.getDamage()*2)); //Points
                ship.boundingBox.setBounds(0,0,0,0);
                player.getLaser().setShow(false);
                explosion(ship);
                iterator.remove();
            }
        }
    }

    /**
     * Ship atacks Player
     * Faz o laser.show da ship passar para false e ir para a posição 0
     * Faz o Player perder vida
     * @param player
     */
    public void handleCollisionsStoP(PlayerShip player){
        for (Ship ship:fleetOfShips) {
            if (ship.getLaser()!=null){
                if(ship.getLaser().getBoundingBox().intersects(player.getBoundingBox())){
                    player.setPoints(player.getPoints()-ship.getDamage()); //Points
                    ship.getLaser().setX(0);
                    ship.getLaser().setY(800);

                    ship.getLaser().setShow(false);
                    explosion(player);
                    player.setLife(player.getLife()-ship.getDamage());
                }
            }
        }
    }

    /**
     * ira dar render a todas as ships da fleetOfShips
     * A medida que elas são eliminadas da fleetOfShips deixam de ser renderizadas (por isso desaparecem)
     */
    public void render(){
        for (Ship ship:fleetOfShips) {
                ship.render();
            }
    }

    /**
     * Seleciona um index random
     * Acedemos a esse index da fleetOfShips
     * Chama o shoot() dessa ship
     */
    public void shoot(){
        if (fleetOfShips.size()>0){
            int index = (int)(Math.random()*fleetOfShips.size());
            fleetOfShips.get(index).shoot();
        }
    }

    /**
     * Criação e animação da explosão
     * @param target é necessário para obtermos a posição da explusão
     */
    public void explosion(Ship target){
        Explosion explosion=new Explosion(batch,target.getX(),target.getY()-10);
        explosion.create();
        explosion.setShow(true);
        explosion.render();
        explosion.setShow(false);
    }
}
