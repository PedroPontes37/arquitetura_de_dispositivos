package pt.uma.arq.entities;

import com.badlogic.gdx.audio.Music;

public interface PlayMusic {
    void playMusic(Music music, float volume, boolean loop);
}
