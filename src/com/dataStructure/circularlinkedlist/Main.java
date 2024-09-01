package com.dataStructure.circularlinkedlist;

public class Main {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;
        Node.traversal(head);
        System.out.println();
        head=Node.insertAtBegin(head,15);
        Node.traversal(head);
        System.out.println();
        head=Node.insertAtEnd(head,40);
        Node.traversal(head);
        System.out.println();
        head=Node.deleteHead(head);
        Node.traversal(head);
        System.out.println();
        head=Node.deleteKthNode(head,3);
        Node.traversal(head);

    }



}
