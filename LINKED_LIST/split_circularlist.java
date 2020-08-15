public class split_circularlist {
    Node head;
        Node t;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public void printList(Node first){
        Node temp = first;
        if (first != null)
        {
          // Keep printing nodes till we reach the first node again
          do
          {
            System.out.print(temp.data + " "); // print data
            temp = temp.next;
          }
          while (temp != first);
        }
      }
    static Node split_list(Node head) {
    
        if(head == null)
          return null;
        Node slow_ptr = head,fast_ptr= head;
        while(fast_ptr.next!=head){
          fast_ptr = fast_ptr.next;
          if(fast_ptr.next!=head){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next;
          }
        }
        fast_ptr.next = slow_ptr.next;
        slow_ptr.next = head;
        return fast_ptr.next;
    }
    public static void main(String[] args){
        //Node t;
        split_circularlist sc = new split_circularlist();
        sc.head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node (4);
        Node d = new Node(5);
        sc.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        sc.head.next.next.next.next.next = sc.head;
        System.out.println("The sub circular linked lists are -->");
        //sc.printList();
        Node t = split_list(sc.head);
        sc.printList(sc.head);
        System.out.println();
        sc.printList(t);
    }
    
}