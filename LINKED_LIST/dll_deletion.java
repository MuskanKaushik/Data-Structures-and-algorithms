import java.util.NoSuchElementException;

public class dll_deletion {
    private Node head;
    private Node tail;
    private int length;

    private class Node
    {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data){
            this.data = data;
        }
    }

    public dll_deletion(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void insertLast(int value){
        Node new_node = new Node(value);
        if(isEmpty()){
            head = new_node;
        }
        else{
            tail.next = new_node;
        }
            new_node.previous = tail;
            tail = new_node;
            length++;
    }

    public void displayForward(){
        if(head==null){
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" "+ "-->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.print("\n");
    }
    
    public void displayBackward(){
        if(tail == null){
            return;
        }
        
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data +" "+ "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }
    //deleting the first node of doubly linked list
    public Node deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node temp = head;
        if(head==tail){
            head = null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    //deleting the last node of doubly linked list
    public Node deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        
        Node temp = tail;
        if(head==tail){
            head = null;
        }
        else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length --;
        return temp;
    }

   //deleting node from any specific position
    static void deleteNode(Node head, int n){
    if (head == null || n <= 0) 
        return; 
  
    Node temp = head;
    int i; 
  
    for (i = 1; temp != null && i < n; i++) { 
            temp = temp.next; 
        } 
    if (temp == null) 
        return; 
  
    deleteNode(head,temp); 
}

static Node deleteNode(Node head, Node d) 
{ 
    if (head == null || d == null) 
        return null; 
 
    if (head == d) 
        head = d.next; 

    if (d.next != null) 
        d.next.previous = d.previous; 

    if (d.previous != null) 
        d.previous.next = d.next; 

    d = null; 

    return head; 
} 

    public static void main(String[] args){

        dll_deletion dll = new dll_deletion();
        dll.insertLast(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);
        dll.insertLast(5);
        dll.insertLast(6);
        System.out.println("Original Doubly Linked List: ");
        dll.displayForward();

        System.out.println("Doubly Linked List after deleting first node: ");
        dll.deleteFirst();
        dll.displayForward();

        System.out.println("Doubly Linked List after deleting last node: ");
        dll.deleteLast();
        dll.displayForward();
       // dll.displayBackward();

       int n=3;
       System.out.println("Doubly Linked List after deleting node from specific position: ");
       deleteNode(dll.head,n);
       dll.displayForward();
    }
}