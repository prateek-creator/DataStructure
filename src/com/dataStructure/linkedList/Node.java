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
        System.out.println();
    }
    public static Node insertAtHead(Node head, int data){

        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    public static Node insertAtTail(Node head,int data){
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
    public static Node insertAtPos(Node head, int pos, int data){
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
    public static Node deleteFirstNode(Node head){
        Node newHead=head.next;
        head.next=null;
        return newHead;
    }
    public static Node deleteLastNode(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    public static int search(Node head,int data){
        if(head==null){
            return -1;
        }
        int pos=1;
        Node curr=head;
        while(curr!=null){
            if(curr.data==data){
                return pos;
            }
            else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }

}
