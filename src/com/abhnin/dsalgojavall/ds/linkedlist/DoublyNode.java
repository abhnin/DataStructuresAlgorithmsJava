package com.abhnin.dsalgojavall.ds.linkedlist;

public class DoublyNode  {

    private int data;
    private DoublyNode prevNode;
    private DoublyNode nextNode;

    public DoublyNode(int data) {
        this.data = data;
        this.nextNode = null;
        this.prevNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(DoublyNode prevNode) {
        this.prevNode = prevNode;
    }

    public DoublyNode getPrevNode() {
        return prevNode;
    }

}
