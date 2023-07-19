package com.rakovets.course.java.core.practice.generics;

public class Obscure <T> {
    private T obcureOblect;

    public Obscure(T obcureOblect) {
        this.obcureOblect = obcureOblect;
    }

    public Obscure() {
    }

    public T getObcureOblect() {
        return obcureOblect;
    }

    public boolean isPresent() {
        return getObcureOblect() != null;
    }

    public boolean isEmpty() {
        return getObcureOblect() == null;
    }

    public T orElse(T object) {
        return isPresent()? obcureOblect: object;
    }


    public T orElseThrow(Exception exception) throws Exception {
        if (isPresent()) {
            return obcureOblect;
        }
        throw exception;
    }

    public static <T> Obscure<T> of(T object) {
        return new Obscure<T>(object);
    }

    public static<T> Obscure<T> empty(){
        return new Obscure<>(null);
    }
}
