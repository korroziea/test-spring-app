package by.rubashenko.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> genreList = new ArrayList<>();

    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public void playMusic() {
        int randomGenreNumber = new Random().nextInt(3);
        int randomSongNumber = new Random().nextInt(3);

        System.out.println(genreList.get(randomGenreNumber).getSongs().get(randomSongNumber));
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
