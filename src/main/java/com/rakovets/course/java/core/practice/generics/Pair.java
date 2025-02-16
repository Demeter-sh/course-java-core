package com.rakovets.course.java.core.practice.generics;

public class Pair <K, V> {
    private K field1;
    private V field2;

    public Pair(K field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public K getField1() {
        return field1;
    }

    public void setField1(K field1) {
        this.field1 = field1;
    }

    public V getField2() {
        return field2;
    }

    public void setField2(V field2) {
        this.field2 = field2;
    }

    public Pair<K, V> getSwapped() {
        Pair<K, V> newPair = new Pair<>(this.field1, this.field2);
            newPair.setField1((K)field2);
            newPair.setField2((V)field1);
        return newPair;
    }
    /*
    public static <K, V> Pair<K, V> swap() {
        Pair<K, V> newPair = null;
        K variable1 = newPair.field1;
        V variable2 = newPair.field2;
        newPair.setField1((K)variable2);
        newPair.setField2((V)variable1);
        return newPair;
    }
    */
}
