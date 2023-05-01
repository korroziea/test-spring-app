package by.rubashenko.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("My Tears Are Becoming a Sea");
        songs.add("My Favourite Game");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
