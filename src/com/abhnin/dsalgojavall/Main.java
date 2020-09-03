package com.abhnin.dsalgojavall;
import com.abhnin.dsalgojavall.ds.linkedlist.DoublyLinkedList;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;

public class Main {

    public static void main(String[] args){
        DoublyLinkedList linkedList = new DoublyLinkedList();

        int x = 1;
        while (x <= 8){
            linkedList.insertAtHead(x);
            x++;
        }


        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());
        linkedList.sort();
        System.out.println(linkedList.toString());


    }


}
