package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K value1;
    private V value2;

    public Pair<V, K> getSwapped() {
        return new Pair<>(value2, value1);
    }

    public static <V, K> Pair<V, K> swap(Pair<K, V> obj) {
        return new Pair<>(obj.value2, obj.value1);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + value1 + ", " + value2;
    }

    public Pair(K value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setValue1(K value1) {
        this.value1 = value1;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }

    public V getValue2() {
        return value2;
    }

    public K getValue1() {
        return value1;
    }
}
