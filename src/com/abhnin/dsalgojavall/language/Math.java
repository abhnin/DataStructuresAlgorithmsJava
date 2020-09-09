package com.abhnin.dsalgojavall.language;

public class Math<T> {
    T obj;

    public Math(T obj) {
        this.obj = obj;
    }

    public String getObj() {
        return obj.getClass().getSimpleName();
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
