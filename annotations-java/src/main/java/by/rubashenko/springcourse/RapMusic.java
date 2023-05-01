package by.rubashenko.springcourse;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Rap God");
        songs.add("PRIDE.");
        songs.add("OUT WEST");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
