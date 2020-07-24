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

    //removing the first node of the list
    static Node removeFirstNode(Node head) 
    { 
        if (head == null) 
            return null; 
  
        //Node temp = head; 
        head = head.next; 
  
        return head; 
    } 

    //removing the last node of the list
    static Node removeLastNode(Node head) 
    { 
        if (head == null) 
            return null; 
  
        if (head.next == null) { 
            return null; 
        } 
        Node sec_last = head; 
        while (sec_last.next.next != null){ 
            sec_last = sec_last.next;} 

        sec_last.next = null; 
  
        return head; 
    } 

    //removing node at a given position
    void delete_Node(int position) 
    { 
        if (head == null) 
            return; 
        Node temp = head; 
 
        if (position == 0) 
        { 
            head = temp.next;    
            return; 
        } 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
        if (temp == null || temp.next == null) 
            return; 
         Node next = temp.next.next; 
  
        temp.next = next;   
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

    //inserting node at a given position
    public void insertAt(int n_val,int pos){
        Node ptr = head;
        Node n_node = new Node(n_val);
        int count = 1;
    
        while(ptr != null && count<pos){
        
            ptr = ptr.next;
            count++;
        }
        n_node.next = ptr.next;
        ptr.next = n_node;
    }

    //inserting a node before a given position
    public void insertBefore(int element, int new_val){
        Node ptr = head;
        Node preptr = null;
        while(ptr != null && (ptr.data != element)){
            
            preptr = ptr;
            ptr = ptr.next;
            }
        
            Node n_node = new Node(new_val);
            n_node.next = ptr;
            preptr.next = n_node;
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

        in.insertAt(20,1);
        System.out.println("\n\nInserting a node at the given position: ");
        in.printList();

        in.insertBefore(4,30);
        System.out.println("\n\nInserting a node before a given node:  ");
        in.printList();

        Node h = removeFirstNode(in.head);
        System.out.println("\n\nDeleting the first node: ");
        for(Node temp = h; temp!=null;temp=temp.next){
            System.out.print(temp.data+ " ");
        }

        Node h1 = removeLastNode(in.head);
        System.out.println("\n\nDeleting the last node: ");
        for (Node temp = h1; temp != null; temp = temp.next) 
            System.out.print(temp.data + " "); 

        in.delete_Node(2);
        System.out.println("\n\nDeleting at a given position: "); //example position = 2
        in.printList();
    }

}