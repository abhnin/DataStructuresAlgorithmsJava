package com.abhnin.dsalgojavall.language;

public class GenericArray<T> {
    public T[] arr;

    public GenericArray(int size) {
        this.arr = (T[]) new Object[size];
    }

}
