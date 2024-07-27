package com.dataStructure.circulardblylinkedlist;

public class Main {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.prev=head;
        head.next.next=new Node(30);
        head.next.next.prev=head.next;
        head.next.next.next=new Node(40);
        head.next.next.next.prev=head.next.next;
        head.next.next.next.next=head;
        head.prev=head.next.next.next;
        Node.traversal(head);
        head=Node.insertAtBegin(head,50);
        Node.traversal(head);
        head=Node.insertAtEnd(head,60);
        Node.traversal(head);
    }




}
