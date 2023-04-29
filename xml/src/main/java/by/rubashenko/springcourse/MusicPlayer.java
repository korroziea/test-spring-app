package by.rubashenko.springcourse;

import java.util.List;
import java.util.ArrayList;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    // IoC
/*    public MusicPlayer(Music music) {
        this.music = music;
    }*/

    public MusicPlayer() {}

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
