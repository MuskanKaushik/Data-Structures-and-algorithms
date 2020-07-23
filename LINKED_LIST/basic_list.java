//import java.util.*;
public class basic_list {
    node head;
    static class node{
        int data;
        node next;
        
        node(int d){
            data = d;
            next = null;
        }
    }
    public void l_list_p(){
        node n = head;
        while(n!=null){
            system.out.println(n.data+ " ");
            n= n.next;
        }

    }

    public static void main(String[] args){
        l_list l = new l_list();
        l.head = new node(1);
        node second = new node(2);
        node third = new node(3);
        l.head.next = second;
        second.next = third;
        l.l_list_p();

    }
    
}