//import java.util.*;
public class Linear_Llist {
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    //inserting a node after a given value
    public void inserAfter(Node p_node, int n){
        if(p_node== null){
            System.out.println("Previous node cannot be zero");
        }
        Node ptr = new Node(n);
        ptr.next = p_node.next;
        p_node.next = ptr;
    }

    //inserting the node at the last
    public void insertlast(int n){
        Node ptr = new Node(n);
        if(head == null){
            head = new Node(n);
        }
        Node e = head;
        while(e.next!=null){
            e = e.next;
        }
        e.next = ptr;
    }
    //inserting the node at the beginning
    public void insertbegin(int n){
        Node ptr = new Node(n);
        ptr.next = head;
        head = ptr;
    }

    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
           n = n.next;
        }

    }
    public static void main(String[] args){
        Linear_Llist in = new Linear_Llist();
        in.head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node (4);
        Node d = new Node(5);
        in.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println();
        System.out.println("Printing the original list: ");
        in.printList();

        in.insertbegin(0);
        System.out.println("\n\nInserting a node at beginning: ");
        in.printList();

        in.insertlast(6);
        System.out.println("\n\nInserting a node at end: ");
        in.printList();

        in.inserAfter(b.next,10);
        System.out.println("\n\nInserting a node after a given value: ");
        in.printList();



    }

    
}