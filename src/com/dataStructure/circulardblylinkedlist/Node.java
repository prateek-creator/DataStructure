package com.dataStructure.circulardblylinkedlist;

public class Node {
    int data ;
    Node prev;
    Node next;
    public Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
    public static void traversal(Node head){
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("");
    }
    public static Node insertAtBegin(Node head, int data){
        Node newNode=new Node(data);
        newNode.prev=head.prev;
        newNode.next=head;
        head.prev.next=newNode;
        head.prev=newNode;
        return newNode;
    }
    public static Node insertAtEnd(Node head, int data){
        Node newNode=new Node(data);
        newNode.prev=head.prev;
        newNode.next=head;
        head.prev.next=newNode;
        head.prev=newNode;
        return head;
    }
}
