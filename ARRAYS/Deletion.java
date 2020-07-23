public class Deletion {
    static class node{
        int info;
        node next;
    };
    public node delete(node start){
        if(start==null){
            return null;
        }
        else{
            node ptr = start;
            start = ptr.next; 
        }

    }
    public static void main(String[] args){
        node start = null;
        node new_n = new node();
       new_n.info = 
    }
    
}