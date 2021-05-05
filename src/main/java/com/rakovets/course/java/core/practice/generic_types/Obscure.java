package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private final T field;

    public Obscure(T field) {
        this.field = field;
    }

    public T get() {
        return field;
    }

    public boolean isPresent() {
        return field != null;
    }

    public boolean isEmpty() {
        return field == null;
    }

    public T orElse(T obj) {
        return this.isPresent() ? field : obj;
    }

    public T orElseThrow(Exception exception) throws Exception {
        if (this.isPresent()) {
            return field;
        } else {
            throw exception;
        }
    }

    public static <S> Obscure<S> of(S obj) {
        return new Obscure<>(obj);
    }

    public static <S> Obscure<S> empty() {
        return new Obscure<>(null);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + field;
    }
}
