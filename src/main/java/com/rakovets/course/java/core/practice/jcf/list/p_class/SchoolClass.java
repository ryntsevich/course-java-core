package com.rakovets.course.java.core.practice.jcf.list.p_class;

import java.util.List;

public class SchoolClass {
    private final List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public static Person getBestStudent(List<Person> students) {
        Person personMaxMark = students.get(0);

        for (Person person : students) {
            if (person.getAverageAnnualMark() > personMaxMark.getAverageAnnualMark()) {
                personMaxMark = person;
            }
        }

        return personMaxMark;
    }
}
