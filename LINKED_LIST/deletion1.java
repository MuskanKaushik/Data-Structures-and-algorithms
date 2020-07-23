import java.util.*;
class deletion 
{ 
    Node head; 
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
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
    //void delete_first(){
       // if (head == null) 
          //  return null; 
  
        
       // Node temp = head; 
       // head = head.next; 
  
       // return head;
    //}
   /* void  removeLastNode(Node head) 
    { 
        if (head == null) 
            return null; 
  
        if (head.next == null) { 
            return null; 
        } 
        Node s_last = head; 
        while (s_last.next.next != null) 
            s_last = second_last.next; 
        s_last.next = null; 
  
        return head; 
    } 
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
    } */
     void deleteNode(int key) 
    { 
        Node temp = head, prev = null; 
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; 
            return; 
        } 
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
        if (temp == null) 
        return; 
  
        prev.next = temp.next; 
    } 
    public void push(int n_data) 
    { 
        Node n_node = new Node(n_data); 
        n_node.next = head; 
        head = n_node; 
    } 
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data + " "); 
            tnode = tnode.next; 
        } 
    } 


public static void main(String[] args) 
{ 
    LinkedList llist = new LinkedList(); 

    llist.push(3); 
    llist.push(1); 
    llist.push(5); 
    llist.push(7); 

    System.out.println("\nLinked list is:"); 
    llist.printList(); 
    llist.deleteNode(7); 
  
        System.out.println("\nLinked List after Deletion of the element:"); 
        llist.printList(); 
        llist.delete_Node(2); 
         System.out.println("\nLinked List after Deletion of the element at position 2: "); 
        llist.printList(); 
    }
}