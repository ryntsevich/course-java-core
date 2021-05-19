package com.rakovets.course.java.core.practice.jcf.list.p_class.comparators;

import com.rakovets.course.java.core.practice.jcf.list.p_class.Person;

import java.util.Comparator;

public class NameSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person t1, Person t2) {
        return (t1.getName() + "" + t1.getSurname()).compareTo((t2.getName() + "" + t2.getSurname()));
    }
}
