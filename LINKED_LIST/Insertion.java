public class LS1 {
    Node head;
    int data;
    static class Node{
        int val;
        
        Node next;

        Node(int v){
            val = v;
            next = null;
        }
    }
    public void printList(){
        Node start = head;
        while(start != null) {
            System.out.print(start.val+" ");
            start = start.next;
        }
    }
    public void insertAt(int new_val,int pos){
        Node ptr = head;
        Node new_node = new Node(new_val);
        int count = 1;
    
        while(ptr != null && count<pos){
        
            ptr = ptr.next;
            count++;
        }
        new_node.next = ptr.next;
        ptr.next = new_node;
       

    }
   /* public void insertAfter(Node node_after, int new_val){
        if(node_after == null){
            System.out.println("The given node is null");
        }
    
        Node new_node = new Node(new_val);
        new_node.next = node_after.next;
    
        node_after.next = new_node;
    }*/
     public void insertAfter(int element, int new_val){
        Node ptr = head;
    
        Node new_node = new Node(new_val);
        while(ptr != null && (ptr.val != element)){
            
            ptr = ptr.next;
            }
            new_node.next = ptr.next;
            ptr.next = new_node;
    }
    public void insertBefore(int element, int new_val){
        Node ptr = head;
        Node preptr = null;
        while(ptr != null && (ptr.val != element)){
            
            preptr = ptr;
            ptr = ptr.next;
            }
        
            Node new_node = new Node(new_val);
            new_node.next = ptr;
            preptr.next = new_node;
    }

    
    public static void main(String args[]){
        LS1 li = new LS1();
        li.head = new Node(10);
        Node second = new Node(78);
        Node third = new Node(92);
        Node fourth = new Node(8);
        Node fifth = new Node(71);
        Node sixth = new Node(16);
        Node seven = new Node(28);
        Node eight = new Node(30);
        li.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seven;
        seven.next = eight;
        while(true){
        System.out.println("");
        //li.printList();
        //li.insertAt(67, 5);
        li.insertAfter(92,67);
        //li.insertBefore(92,67);
        }
        li.printList();
    }

}