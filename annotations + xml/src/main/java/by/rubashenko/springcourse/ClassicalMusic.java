package by.rubashenko.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("My Tears Are Becoming a Sea");
        songs.add("My Favourite Game");
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
