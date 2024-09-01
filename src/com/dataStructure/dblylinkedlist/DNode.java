package com.dataStructure.dblylinkedlist;


public class DNode {
    DNode prev;
    DNode next;
    int data;
    public DNode(int data){
        this.data=data;
        prev=null;
        next=null;
    }
    public static void printList(DNode head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static DNode insertAtBegin(DNode head, int data){
        DNode newNode=new DNode(data);
        if(head==null){
            return newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

    }
    public static DNode insertAtEnd(DNode head, int data){
        DNode newNode=new DNode(data);
        if(head==null){
            return newNode;
        }
        DNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
        return head;

    }
    public static DNode insertAtGivenPos(DNode head, int pos, int data){
        DNode newNode=new DNode(data);
        if(pos==1){
            newNode.next=head;
            head.prev=newNode;
        }
        DNode curr=head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        newNode.prev=curr;
        if(newNode.next!=null)
            newNode.next.prev=newNode;

        return head;
    }
    public static DNode reversal(DNode head){
        if(head==null || head.next==null){
            return head;
        }
        DNode temp=null,curr=head;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        return temp.prev;
    }
    public static DNode removeHead(DNode head){
        if(head==null || head.next==null){
            return null;
        }
        head=head.next;
        head.prev=null;
        return head;
    }
    public static DNode removeTail(DNode head){
        if(head==null || head.next==null){
            return null;
        }
        DNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }

}
