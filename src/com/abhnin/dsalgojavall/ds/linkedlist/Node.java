package com.abhnin.dsalgojavall.ds.linkedlist;

public class Node {
    private Node nextNode;
    private int data;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
