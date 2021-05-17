package com.rakovets.course.java.core.practice.jcf.list.studio.comparators;

import com.rakovets.course.java.core.practice.jcf.list.studio.Actor;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor t1, Actor t2) {
        return t2.getLastName().compareTo(t1.getLastName());
    }
}
