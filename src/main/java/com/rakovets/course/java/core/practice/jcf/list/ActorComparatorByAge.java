package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;

public class ActorComparatorByAge implements Comparator <Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1 == o2) {
            return 0;
        } else return Integer.compare(o1.getAge(), o2.getAge());
    }
}