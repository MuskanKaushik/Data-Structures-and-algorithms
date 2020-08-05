public class add {
     Node head;
     Node head1;
    static  class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    //reversing the node
    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 

     //adding the list
     public static void addnumbers(Node head,Node head1){
        Node ptr = head;
        Node ptr1 = head1;
        int c = 0, sum = 0;
        while(ptr != null || ptr1 != null){
            if(ptr == null){
                sum = ptr1.data + c;
            }
            else
            if(ptr1 == null){
                sum = ptr.data + c;
            }
            else{
          sum = ptr.data+ptr1.data+c;
            }
          c = sum/10;
          sum = sum % 10;
          System.out.print(sum+" ");
          
        if(ptr != null)
        ptr = ptr.next;
        if(ptr1 != null)
        ptr1 = ptr1.next;
        }
    }


    public void printlist(Node n){
        while(n!=null){
            System.out.println(n.data+" ");
            n = n.next;
        }

    }
    public static void main(String[] args){
        add a = new add();
        add a1 = new add();

        a.head =new Node(1);
        Node n = new Node(2);
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        a.head.next = n;
        n.next = n1;
        n1.next = n2;
        System.out.println(" ");
        System.out.println("LINKED LIST 1:");
        a.printlist(a.head);

        a1.head1 = new Node(2);
        Node b = new Node(2);
        Node b1 = new Node(2);
        Node b2 = new Node(2);
        a1.head1.next = b;
        b.next = b1;
        b1.next = b2;
        System.out.println("\n\nLINKED LIST 2:");
        a.printlist(a1.head1);

        a.head = a.reverse(a.head);
        a1.head1 = a1.reverse(a1.head1);
    
        System.out.println("\n"); 
        System.out.println("Reversed linked list "); 
        a.printlist(a.head); 
        System.out.print("\n");
        a1.printlist(a1.head1);
        System.out.print("\n");

        System.out.println("\nSum of the number is");
        addnumbers(a.head,a1.head1);

    } 
    
}