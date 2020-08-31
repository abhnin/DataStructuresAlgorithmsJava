package com.abhnin.dsalgojavall;


import com.abhnin.dsalgojavall.ds.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        int x = 1;
        while (x <= 10){
            linkedList.addNodeAtTail(x);
            x++;
        }

        linkedList.deleteFromHead();

        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());
    }
}
