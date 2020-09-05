package com.abhnin.dsalgojavall.ds.stack;

import com.abhnin.dsalgojavall.ds.linkedlist.Node;

public class StackLL implements Iamastack {
    Node head;

    @Override
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

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public Boolean clear() {
        return null;
    }
}

