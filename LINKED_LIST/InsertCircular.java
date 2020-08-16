public class InsertCircular{
    public static void main(String[] args){
        CircularList myList = null;
        myList = insert(myList,1);
        myList.printList();

        myList.next = new CircularList(3);
        myList.next.next = new CircularList(5);
        myList.next.next.next = myList;

        myList = insert(myList, 2);
        myList.printList();

        myList= insert(myList,0);
        myList.printList();

        myList= insert(myList,6);
        myList.printList();

    }
    static CircularList insert(CircularList my_List, int n){
        if(my_List==null){
            return new CircularList(n);
        }
        else if(my_List.next == my_List){ // check if only one element is there
            my_List.next = new CircularList(n); // add this node
            my_List.next.next = my_List; //the next's reference points back to head to form
            //circular list
            return my_List.data<n ? my_List: my_List.next;
        }
        else if(n<my_List.data){
            CircularList current = my_List;
            while(current.next!=my_List)
                current = current.next;
    
            current.next = new CircularList(n);
            current.next.next = my_List;
            return current.next;
        }

        CircularList current = my_List;
        while(current.next!=my_List && current.next.data<=n){
            current = current.next;
        }
        CircularList currentNext = current.next;
        current.next = new CircularList(n);
        current.next.next  = currentNext;
        return my_List;

    }
}
class CircularList{
    int data;
    CircularList next;
    CircularList(int k){
        data = k;
        next = this;
    }
    public void printList(){
        if(this == null){
            return;}


        CircularList current = this;
        do{
            System.out.print(current.data+"-->");
            current = current.next;
        }while(current!=this);
        System.out.println();
    }
}
