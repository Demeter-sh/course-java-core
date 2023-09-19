package com.rakovets.course.java.core.practice.generics;

public class Obscure <T> {
    private T obscureObject;

    public Obscure(T obcureOblect) {
        this.obscureObject = obcureOblect;
    }

    public Obscure() {
    }

    public T getObscureObject() {
        return obscureObject;
    }

    public boolean isPresent() {
        return getObscureObject() != null;
    }

    public boolean isEmpty() {
        return getObscureObject() == null;
    }

    public T orElse(T object) {
        return isPresent()? obscureObject : object;
    }


    public T orElseThrow() {
        try {
            if (obscureObject == null) {
                throw new Exception();
            }
        } catch(Exception ex) {
            return (T) ex.getMessage();
        }
        return obscureObject;
    }

    public static <T> Obscure<T> of(Obscure<T> object) {
        return object;
    }

    public static<T> Obscure<T> empty(){
        return new Obscure<>(null);
    }
}
