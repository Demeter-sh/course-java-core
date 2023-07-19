package com.rakovets.course.java.core.practice.generics;

import jdk.dynalink.beans.StaticClass;

public class Pair <K, V> {
    private K fieldK;
    private V fieldV;

    public Pair(K fieldK, V fieldV) {
        this.fieldK = fieldK;
        this.fieldV = fieldV;
    }

    public K getFieldK() {
        return fieldK;
    }

    public V getFieldV() {
        return fieldV;
    }

    public void setFieldK(K fieldK) {
        this.fieldK = fieldK;
    }

    public void setFieldV(V fieldV) {
        this.fieldV = fieldV;
    }

    public Pair <K, V> getSwapped() {
        return new Pair(this.fieldV, this.fieldK);
    }
    public static<K, V> Pair swap(Pair<K, V> pair) {
        return new Pair<>(pair.getFieldV(), pair.getFieldK());
    }
}
