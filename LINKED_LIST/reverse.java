public class reverse {
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static Node reverse_Linked_List(Node head){
        Node p_Node=null;
        Node current = head;
        Node next;
		while(current!=null)
		{
            next = current.next;
            current.next = p_Node;
            p_Node = current;
			current = next;
		}
        head = p_Node;
        return head;

    }
    public void printList(Node head){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
           n = n.next;
        }
    }
    public static void main(String[] args){
        reverse in = new reverse();
        in.head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node (4);
        Node d = new Node(5);
        Node e = new Node(6);
        in.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println();
        System.out.println("Printing the original list: ");
        in.printList(in.head);
        //reversing
        Node r = reverse_Linked_List(in.head);
		System.out.println("\n\nAfter reversing: ");
		in.printList(r);

    }
}