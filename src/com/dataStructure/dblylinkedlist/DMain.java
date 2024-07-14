package com.dataStructure.dblylinkedlist;

public class DMain {
    public static void main(String[] args) {
        DNode node1=new DNode(10);
        node1.next=new DNode(20);
        node1.next.prev=node1;
        DNode.printList(node1);
        node1=DNode.insertAtBegin(node1,30);
        DNode.printList(node1);
        node1=DNode.insertAtEnd(node1,80);
        DNode.printList(node1);
        DNode.insertAtGivenPos(node1,3,90);
        DNode.printList(node1);
        node1=DNode.reversal(node1);
        DNode.printList(node1);
    }
}
