public class sort {
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
        public Node middle_Node(Node head) {
            Node fast_n = head;
            Node slow_n = head;
            while (fast_n.next!=null&&fast_n.next.next!=null){
                slow_n = slow_n.next;
                fast_n = fast_n.next.next;
            }
            return slow_n;
        }
        
        public Node merging(Node a, Node b){
            Node r = null;
            if (a==null){
                return b;
            }
            if (b==null){
                return a;
            }
            if (a.data<=b.data){
                r = a;
                r.next = merging(a.next, b);
            } else {
                r = b;
                r.next = merging(a, b.next);
            }
            return r;
        }

        public Node sorting(Node head){
            if (head==null||head.next==null){
                return head;
            }
            Node mid = middle_Node(head);
            Node midPlus = mid.next;
            mid.next = null;
            Node l = sorting(head);
            Node r = sorting(midPlus);
            Node f_node = merging(l, r);
            return f_node;
        }
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
           n = n.next;
        }
    }
    
    public static void main(String[] args){
        sort in = new sort();
        in.head = new Node(3);
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node (6);
        Node d = new Node(4);
        Node e = new Node(5);
        in.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println();
       System.out.println("Printing the sorted list: ");
        in.head = in.sorting(in.head);
        in.printList();
    }
    
}