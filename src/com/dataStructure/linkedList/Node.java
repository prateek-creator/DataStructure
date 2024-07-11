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
    public Node insertAtHead(Node head, int data){

        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    public Node insertAtTail(Node head,int data){
        Node newNode = new Node(data);
        if(head==null){
            return newNode;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        return head;

    }
    public Node insertAtPos(Node head, int pos, int data){
        Node tempNode=new Node(data);
        if(pos==1){
            tempNode.next=head;
            return tempNode;
        }
        Node currentNode=head;
        for(int i=1;i<pos-1;i++){
            currentNode=currentNode.next;

        }
        tempNode.next=currentNode.next;
        currentNode.next=tempNode;
        return head;

    }
}
