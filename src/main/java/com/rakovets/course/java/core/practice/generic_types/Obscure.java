package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private final T field;

    public T get() {
        return field;
    }

    public Boolean isPresent() {
        return field != null;
    }

    public Boolean isEmpty() {
        return field == null;
    }

    public T orElse(T obj) {
        return this.isPresent() ? field : obj;
    }

    public T orElseThrow(NullPointerException exception) {
        if (this.isPresent()) {
            return field;
        } else {
            throw exception;
        }
    }

    public static <S> Obscure<S> of(S obj) {
        return new Obscure<S>(obj);
    }

    public static <S> Obscure<S> empty() {
        return new Obscure<S>(null);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + field;
    }

    Obscure(T field) {
        this.field = field;
    }
}
