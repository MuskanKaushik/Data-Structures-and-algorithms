public class detect_loop {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
        data = d;
        next = null;
    }
}
public boolean detectloop(){
    Node slow_pointer = head;
    Node fast_pointer = head;
    while(fast_pointer!=null && fast_pointer.next!=null){
        slow_pointer = slow_pointer.next;
        fast_pointer = fast_pointer.next.next;
        if(slow_pointer == fast_pointer){
            return true;
        }
    }
    return false;
}
public void printlist(){
    Node n = head;
    while(n!=null){
        System.out.println(n.data + " ");
        n = n.next;
    }
}
public static void main(String[] args){
    detect_loop dl = new detect_loop();
    dl.head = new Node(1);
    Node a = new Node(2);
    Node b = new Node(3);
    Node c = new Node(4);
    Node d = new Node(5);
    Node e = new Node(6);
    dl.head.next = a;
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    System.out.println();
    System.out.println("Printing the linked list: ");
    dl.printlist();
    dl.head.next.next.next = dl.head.next;
    boolean result = dl.detectloop();
    if(result == true){
        System.out.println("Loop found");
    }
    else
    System.out.println("Loop not found");
}
}