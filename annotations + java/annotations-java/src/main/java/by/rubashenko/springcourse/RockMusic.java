package by.rubashenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Blind");
        songs.add("Undone");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
