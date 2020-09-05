package com.abhnin.dsalgojavall.ds.linkedlist;

public class DoublyLinkedList {
    DoublyNode headNode;

    public void insertAtHead(int data){
        if (headNode == null){
            DoublyNode node = new DoublyNode(data);
            headNode = node;
            return;
        }
        DoublyNode node = new DoublyNode(data);
        node.setNextNode(headNode);
        headNode.setPrevNode(node);
        headNode = node;
    }

    public void insertAtTail(int data){
        if (headNode == null){
            DoublyNode node = new DoublyNode(data);
            headNode = node;
            return;
        }

        DoublyNode tempNode;
        tempNode = headNode;

        while (tempNode.getNextNode() != null){
            tempNode = tempNode.getNextNode();
        }



        DoublyNode node = new DoublyNode(data);
        tempNode.setNextNode(node);
        node.setPrevNode(tempNode);
        node.setNextNode(null);

    }

    public DoublyNode getTail(){
        DoublyNode tempNode;
        tempNode = headNode;

        while (tempNode.getNextNode() != null){
            tempNode = tempNode.getNextNode();
        }

        return tempNode;
    }


    public int size(){
        if (this.headNode == null)
            return 0;

        DoublyNode tempNode = headNode;
        int size = 0;
        if (tempNode != null)
            size = 1;

        while (tempNode.getNextNode() != null){
            size++;
            tempNode = tempNode.getNextNode();
        }

        return size;
    }

    @Override
    public String toString() {
        String out = "";
        if (headNode == null){
            return "";
        }
        DoublyNode tempNode = headNode;

        while (tempNode.getNextNode() != null){
            out += tempNode.getData() + ", ";
            tempNode = tempNode.getNextNode();
        }

        out += tempNode.getData();

        return  out;
    }

    public void sort(){
        DoublyNode tempNodeI;
        tempNodeI = headNode;

        while (tempNodeI != null){
            DoublyNode tempNodeJ;
            tempNodeJ = tempNodeI;
            while (tempNodeJ.getPrevNode() != null){
                if (tempNodeJ != null && tempNodeJ.getData() < tempNodeI.getData()){
                    int temp = 0;
                    temp = tempNodeJ.getData();
                    tempNodeJ.setData(tempNodeI.getData());
                    tempNodeI.setData(temp);
                    break;
                }
                tempNodeJ = tempNodeJ.getPrevNode();
            }
            tempNodeI = tempNodeI.getNextNode();
        }
    }


}
