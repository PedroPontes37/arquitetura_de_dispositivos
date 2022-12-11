package pt.uma.arq.game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.entities.*;
import sun.font.TrueTypeFont;


import java.awt.*;

public class Game extends ApplicationAdapter  {
    private SpriteBatch batch;
    private BackgroundManagement backgroundManagement;
    private BitmapFont font;
    private Music music;
    private Music musicWin;

    private Music musicDefeat;

    public static final String FONT_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;,{}\"´`'<>";

    private PlayerShip player;
    private Fleet fleet;
    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(600, 700);
        batch = new SpriteBatch();
        font = new BitmapFont(Gdx.files.internal("gamefont.fnt"),
                Gdx.files.internal("gamefont.png"), false);
        backgroundManagement = new BackgroundManagement(batch);
        //criar o player->
        player= new PlayerShip(batch,new Rectangle(300, 100,24,36));
        player.create();
        //fim de criar player <-

        //criar fleet ->
        fleet=new Fleet(batch);
        fleet.create();
        //fim de criar fleet <-

        music=Gdx.audio.newMusic(Gdx.files.internal("gamemusic.mp3"));
        musicWin= Gdx.audio.newMusic(Gdx.files.internal("ronaldo.mp3"));
        //musicWin= Gdx.audio.newMusic(Gdx.files.internal("win.mp3"));
        musicDefeat= Gdx.audio.newMusic(Gdx.files.internal("sadMusic.mp3"));



    }
    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        if (player.getLaser()!=null){
            fleet.handleCollisionsPtoS(player);
        }
        fleet.handleCollisionsStoP(player);

        backgroundManagement.render();
        font.setColor(Color.BLUE);
        font.draw(batch, "Score: "+player.getPoints(), 450, 670);
        font.draw(batch, "Life: "+player.getLife(), 40, 670);
        //player functions
        fleet.render();
        if (player.getLife()>0){
            player.render();
            music.setVolume(0.4f);
            music.setLooping(true);
            music.play();
        }else{
            player.setLife(0);
            music.pause();
            musicDefeat.setVolume(0.4f);
            musicDefeat.setLooping(false);
            musicDefeat.play();
            font.draw(batch, "YOU LOSE", 240, 300);
            font.draw(batch, "Score: "+player.getPoints(), 235, 250);
            player.getBoundingBox().setBounds(0,0,0,0);
        }
        if(fleet.getFleetOfShips().size()==0){
            music.pause();
            musicWin.setVolume(0.8f);
            musicWin.setLooping(false);
            musicWin.play();
            font.draw(batch, "YOU WIN", 240, 400);
            font.draw(batch, "Score: "+player.getPoints(), 235, 350);
        }
        batch.end();
    }
    @Override
    public void dispose() {

      //  music.dispose();
    }
}