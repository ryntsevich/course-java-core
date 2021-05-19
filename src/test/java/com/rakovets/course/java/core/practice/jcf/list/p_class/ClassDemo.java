package com.rakovets.course.java.core.practice.jcf.list.p_class;

import com.rakovets.course.java.core.practice.jcf.list.p_class.comparators.AgeComparator;
import com.rakovets.course.java.core.practice.jcf.list.p_class.comparators.AverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf.list.p_class.comparators.NameSurnameComparator;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        students.add(new Person("Anna", "Black", 14, 7.8));
        students.add(new Person("Peter", "Snow", 15, 8.6));
        students.add(new Person("Ann", "Laurens", 14, 8.4));
        students.add(new Person("Ben", "Barnes", 15, 9.0));

        System.out.println(students);
        System.out.println(SchoolClass.getBestStudent(students));

        students.sort(new NameSurnameComparator());
        System.out.println(students);

        students.sort(new AgeComparator());
        System.out.println(students);

        students.sort(new AverageAnnualMarkComparator());
        System.out.println(students);

    }
}
