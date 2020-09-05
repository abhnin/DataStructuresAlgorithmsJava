package com.abhnin.dsalgojavall.ds.stack;

import java.util.EmptyStackException;

public class StackA implements Iamastack {
    private int[] stackArray;
    private int currentIndex;

    public StackA(int size) {
        this.stackArray = new int[size];
        this.currentIndex = -1;
    }

    @Override
    public Boolean push(int data) {
        if (currentIndex < this.stackArray.length -1){
            currentIndex++;
            stackArray[currentIndex] = data;
            return true;
        }else{
            throw new StackOverflowError();
        }
    }

    @Override
    public int pop() {
            if (currentIndex < 0){
                throw new EmptyStackException();
            }

            int data = this.stackArray[currentIndex];
            this.stackArray[currentIndex] = 0;
            currentIndex--;
            return data;
    }

    @Override
    public int peek() {
        if (currentIndex < 0){
            throw new EmptyStackException();
        }

        return this.stackArray[currentIndex];

    }

    @Override
    public Boolean clear() {
        while (this.currentIndex >= 0){
            this.stackArray[currentIndex] = 0;
            currentIndex--;
        }
        return true;
    }

    @Override
    public String toString() {
        int temp = 0;
        String output = "";
        while (temp <= currentIndex){
            output += "[ " + this.stackArray[temp] + " ]";
            temp++;
        }

        return output;
    }
}
