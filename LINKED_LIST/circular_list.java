//Check if the given list is circular or not
public class circular_list{
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
}
static boolean is_circular( Node head)
{
    if (head == null)
    return true;
 
    Node node = head.next;

    while (node != null && node != head)
    node = node.next;
 
   
    return (node == head);
}
 
public static void main(String[] args){
        circular_list cl = new circular_list();
        cl.head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node (4);
        Node d = new Node(5);
        cl.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        cl.head.next.next.next.next.next = cl.head;
        System.out.println("The above linked list is circular or not? -->");
        System.out.println(is_circular(cl.head));
}
}