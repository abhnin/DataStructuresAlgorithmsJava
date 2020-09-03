package com.abhnin.dsalgojavall.ds.linkedlist;

public class LinkedList {
    Node headNode;

    public void addNodeAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(headNode);
        headNode = newNode;
    }
    public void addNodeAtTail(int data){
        Node lastNode = getLastNode();
        Node newLastNode = new Node(data);
        if (lastNode == null){
            headNode = newLastNode;
        }else{
            lastNode.setNextNode(newLastNode);
        }

    }
    private Node getLastNode() {
        if (headNode == null){
            return headNode;
        }
        Node tempNode = headNode;

        while (tempNode.getNextNode() != null){
            tempNode = tempNode.getNextNode();
        }

        return tempNode;
    }
    public int size(){
        if (this.headNode == null)
            return 0;

        Node tempNode = headNode;
        int size = 0;
        if (tempNode != null)
            size = 1;

        while (tempNode.getNextNode() != null){
            size++;
            tempNode = tempNode.getNextNode();
        }

        return size;
    }
    public void deleteFromHead(){
        this.headNode = this.headNode.getNextNode();
    }
    public Node find(int data){
            Node tempNode =  headNode;
            while (tempNode != null){
                if (tempNode.getData() == data){
                    return tempNode;
                }
                tempNode = tempNode.getNextNode();
            }
            return null;
    }

    @Override
    public String toString() {
        String out = "";
        if (headNode == null){
            return "";
        }
        Node tempNode = headNode;

        while (tempNode.getNextNode() != null){
            out += tempNode.getData() + ", ";
            tempNode = tempNode.getNextNode();
        }

        out += tempNode.getData();

        return  out;
    }
}
