package com.rakovets.course.java.core.practice.generics;

public class Obscure <T> {
    private T field;

    public T get() {
        return field;
    }

    public Obscure(T field) {
        this.field = field;
    }

    public boolean isPresent() {
        return field != null;
    }

    public boolean isEmpty() {
        return field == null;
    }

    public T orElse(T anotherField) {
        if(field == null) {
            return anotherField;
        } else return field;
    }

    public T orElseThrow(Exception ex) throws Exception {
        if (field != null) {
            return field;
        } else throw ex;
    }

    public static <T> Obscure<T> of(T anotherField) {
        return new Obscure<>(anotherField);
    }

    public static <T> Obscure<T> empty () {
        return new Obscure<>(null);
    }
}
