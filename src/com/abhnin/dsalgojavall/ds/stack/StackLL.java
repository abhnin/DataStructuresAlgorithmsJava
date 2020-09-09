package com.abhnin.dsalgojavall.ds.stack;

import com.abhnin.dsalgojavall.ds.linkedlist.Node;

public class StackLL  {
    Node head;

    public Boolean push(int data) {
        if (head == null){
            Node newNode = new Node(data);
            this.head = newNode;
        }else {
            Node newNode = new Node(data);
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
        return true;
    }

    public int pop() {
        return 0;
    }

    public int peek() {
        return 0;
    }

    public Boolean clear() {
        return null;
    }
}

