package com.dataStructure.linkedList;

public class Node {
    public int data;
    public Node next;
    Node(int data){
        this.data =data;
        this.next=null;
    }
    public static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
