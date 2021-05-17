package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.Comparator;
import java.util.List;

public class Studio {
    private final List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> actors) {
        actors.sort(new Comparator<Actor>() {
            @Override
            public int compare(Actor t1, Actor t2) {
                return t1.getFee() - t2.getFee();
            }
        });
        actors.remove(actors.size() - 1);
    }

    @Override
    public String toString() {
        return "" + actors;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
