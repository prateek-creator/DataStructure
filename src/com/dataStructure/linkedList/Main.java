package com.dataStructure.linkedList;

public class Main {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        Node.printList(head);
        head=Node.insertAtPos(head,1,10);
        Node.printList(head);
        head=Node.insertAtHead(head,12);
        Node.printList(head);
        head=Node.insertAtTail(head,4);
        Node.printList(head);
        head=Node.deleteLastNode(head);
        Node.printList(head);
    }
}