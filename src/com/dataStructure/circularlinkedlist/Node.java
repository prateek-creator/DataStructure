package com.dataStructure.circularlinkedlist;

public class Node {
    public int data;
    public Node next;
    Node(int data){
        this.data =data;
        this.next=null;
    }
    public static void traversal(Node head){
        if(head==null){
            return;
        }
        Node temp=head;
        do{
            System.out.println(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);

    }
    public static Node insertAtBegin(Node head, int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        temp.next=newNode;
        return newNode;
    }
    public static Node insertAtEnd(Node head, int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        temp.next=newNode;
        return head;
    }
    public static Node deleteHead(Node head){
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        head=temp.next.next;
        temp.next=head;
        return head;
    }
    public  static Node deleteKthNode(Node head, int pos){
        if(pos==1){
            return deleteHead(head);
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

}
