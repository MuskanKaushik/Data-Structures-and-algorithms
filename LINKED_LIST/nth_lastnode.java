import java.util.*;
public class nth_lastnode {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next=null;
        }
    }
    void nthfromlast(int n){
        Node ptr = head;
        Node ptr1 = head;
        int c= 0;
        while(c<n && ptr!=null){
            ptr = ptr.next;
            c++;
        }
        while(ptr!=null){
            ptr1 = ptr1.next;
            ptr = ptr.next;
        }
        System.out.println("\n");
        System.out.println("The nth node from last is:" +ptr1.data);

    }

    public void printList(Node head){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
           n = n.next;
        }
    }
    public static void main(String[] args){
    nth_lastnode lnode = new nth_lastnode();
    lnode.head = new Node(1);
    Node a = new Node(2);
    Node b = new Node(3);
    Node c = new Node (4);
    Node d = new Node(5);
    Node e = new Node(6);
    lnode.head.next = a;
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    System.out.println();
    System.out.println("Printing the original list: ");
    lnode.printList(lnode.head);
    lnode.nthfromlast(4);
 }
    
}