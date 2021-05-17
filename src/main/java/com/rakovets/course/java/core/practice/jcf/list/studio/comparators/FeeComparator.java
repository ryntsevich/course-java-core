package com.rakovets.course.java.core.practice.jcf.list.studio.comparators;

import com.rakovets.course.java.core.practice.jcf.list.studio.Actor;

import java.util.Comparator;

public class FeeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor t1, Actor t2) {
        return t2.getFee() - t1.getFee();
    }
}
