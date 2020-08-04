import java.util.Stack;
public class Llist_palindrome {
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static boolean isPalindrome(Node head) {
 
        Node temp = head;
        Stack<Integer> st = new Stack<>();
  
       //Push all nodes value in a stack
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
  
        temp = head;
  
        while (temp != null) {
            if (temp.data != st.pop()) {
                return false;
            }
  
            temp = temp.next;
        }
        return true;
  }

    public void printList(Node head){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
           n = n.next;
        }
    }
    public static void main(String[] args){
        Llist_palindrome in = new Llist_palindrome();
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
        
        boolean result = isPalindrome(in.head);
       if(result==true){
        System.out.println("\nGiven Linked list is a palindrome ");   
       }
       else{
        System.out.println("\nGiven Linked list is not a palindrome ");   
       }
}
}