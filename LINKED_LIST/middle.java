public class middle {
    Node head;

    static class Node{
        int data;
        Node next;
    Node(int d){
        data = d;
        next = null;
    }
}



public void printList(){
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public Node MiddleNode(Node head)
	{
		Node slowP, fastP; 
		slowP = fastP = head; 
 
		while(fastP !=null) { 
			fastP = fastP.next; 
			if(fastP != null && fastP.next != null) { 
				slowP = slowP.next; 
				fastP = fastP.next; 
			} 
		} 
 
		return slowP; 
    }
    public static void main(String[] args){
        middle in = new middle();
        in.head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(6);
        Node c = new Node (4);
        Node d = new Node(1);
       Node e = new Node(6);
        in.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println();
        System.out.println("Printing the original list: ");
        in.printList();
        Node m = in.MiddleNode(in.head);
		System.out.println("Middle node will be: "+ m.data);
    
    } 
}