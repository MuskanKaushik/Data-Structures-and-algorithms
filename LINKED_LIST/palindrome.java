public class palindrome {
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static boolean checkPalindrome(Node head) {
 
        Node slow_pointer = head;
        Node fast_pointer = head;
        Node prev_node = null;
        
        //finding the middle of the node and also reversing the node....
        while (fast_pointer != null && fast_pointer.next != null) {
   
            fast_pointer = fast_pointer.next.next;
   
            Node temp = slow_pointer;
            slow_pointer = slow_pointer.next;
    
            temp.next = prev_node;
             prev_node = temp;
         }
           if (fast_pointer != null) {
             slow_pointer = slow_pointer.next;
           }
           
           //comparing the left side of the node after revering to the right side of the node
           while (prev_node != null && slow_pointer != null) {
               if (prev_node.data != slow_pointer.data) {
                    return false;
               }
               prev_node = prev_node.next;
               slow_pointer = slow_pointer.next;
           }
        return prev_node == null && slow_pointer == null;
  }
    public void printList(Node head){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
           n = n.next;
        }
    }
    public static void main(String[] args){
        palindrome in = new palindrome();
        in.head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node (3);
        Node d = new Node(2);
        Node e = new Node(1);
        in.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println();
        System.out.println("Printing the original list: ");
        in.printList(in.head);
        boolean result = checkPalindrome(in.head);
        if(result==true){
            System.out.println("\n\nGiven linked list is a palindrome");
        }
        else
        System.out.println("\n\nGiven linked list is not a palindrome");
}
}