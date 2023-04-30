package by.rubashenko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Enum genre) {
        int randomSongNumber = new Random().nextInt(3);

        if (genre == Genre.ROCK) {
            System.out.println(music1.getSongs().get(randomSongNumber));
        } else {
            System.out.println(music2.getSongs().get(randomSongNumber));
        }
    }
}
