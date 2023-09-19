package com.rakovets.course.java.core.practice.generics;

public class Pair <K, V> {
    private K first;
    private V second;

    public Pair (K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(getSecond(), getFirst());
    }

    public static<V, K> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.second, pair.first);
    }
}
