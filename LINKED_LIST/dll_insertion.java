public class dll_insertion {
     Node head=null;
     Node tail;
     int length;

    private class Node
    {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data){
            this.data = data;
        }
    }

    public dll_insertion(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    //inserting node at last
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
     
    //inserting a node at the beginning
    public void insertFirst(int value){
        Node new_node = new Node(value);
        if(isEmpty()){
            tail = new_node;
        }else{
            head.previous = new_node;
        }
        new_node.next = head;
        head = new_node;
        length++;
    }

    //inserting node after any given node
    public void insertAfter(Node prev_node, int n){
        if(prev_node == null){
            System.out.println("Previous node can not be null");
            return;
        }

        Node new_node = new Node(n);
        new_node.next= prev_node.next;
        prev_node.next = new_node;
        new_node.previous = prev_node;
    }

    //inserting a node before a given node
    void insertBefore(Node head, Node next_node, int n){  
    if (next_node == null) {  
        System.out.println("the given next node cannot be NULL");  
        return;  
    }  
  
    Node new_node = new Node(n);  
    new_node.data = n;  
    new_node.previous = next_node.previous;  
    next_node.previous = new_node;  
    new_node.next = next_node;  
    if (new_node.previous != null)  
        new_node.previous.next = new_node;  
    
    else
        head= new_node; 
    } 

    public static void main(String[] args){

        dll_insertion dll = new dll_insertion();
        dll.insertLast(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);
        dll.insertLast(5);
        dll.insertLast(6);
        System.out.println("Original Doubly Linked List: ");
        dll.displayForward();

        System.out.println("Doubly Linked List after inserting at beginning: ");
        dll.insertFirst(10);
        dll.displayForward();

        System.out.println("Doubly Linked List after inserting at last: ");
        dll.insertLast(100);
        dll.displayForward();
       // dll.displayBackward();

       System.out.println("Inserting node after a given node: ");
       dll.insertAfter(dll.head.next,40);
       dll.displayForward();
        
       System.out.println("Inserting node before a given node: ");
       dll.insertBefore(dll.head,dll.head.next.next,20);
       dll.displayForward();
    }
    
}