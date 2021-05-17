package com.rakovets.course.java.core.practice.jcf.list;

import com.rakovets.course.java.core.practice.jcf.list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf.list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf.list.studio.comparators.FeeComparator;
import com.rakovets.course.java.core.practice.jcf.list.studio.comparators.LastNameComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Anna", "Stone", 20, 18));
        actors.add(new Actor("Anna", "Stone", 40, 25));
        actors.add(new Actor("Kate", "Smith", 55, 20));
        actors.add(new Actor("Patrick", "Stark", 100, 35));
        Studio studio = new Studio(actors);
        System.out.println(studio);
        studio.fire(actors);
        System.out.println(studio);

        LastNameComparator lastNameComparator = new LastNameComparator();
        actors.sort(lastNameComparator);
        System.out.println(actors);

        FeeComparator feeComparator = new FeeComparator();
        actors.sort(feeComparator);
        System.out.println(actors);

        Comparator<Actor> LastNameAndFeeComparator = lastNameComparator.thenComparing(feeComparator);
        actors.sort(LastNameAndFeeComparator);
        System.out.println(actors);
    }
}
