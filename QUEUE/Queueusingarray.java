//Implemenatation of Queue using array
import java.util.*;
class Queueimplemenatation{
    protected int Queue[];
    protected int front, rear, size, len;

    public Queueimplemenatation(int n){
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){       //to check if queue is empty
        return front==-1;
    }

    public boolean isFull(){
        return front==0 && rear == size-1;
    }

    public int getSize(){
        return len;
    }

    public int peek(){

        if(isEmpty())
        throw new NoSuchElementException("Underflow Exception");
        return Queue[front];
    }

    public void insert(int i){ //inserting element in queue
        if(rear == -1)
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if(rear+1>=size)
            throw new IndexOutOfBoundsException("Overflow Exception");

        else if(rear +1<size)
            Queue[++rear]=i;
        len++;
    }

    public int remove(){      //removing element in queue
        if(isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        else{
            len--;
            int ele = Queue[front];
            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
                front++;
            
                return ele;
        }
    }

    public void display()
    {
        System.out.print("\nQueue = ");
        if(len == 0)
        {
            System.out.print("Empty\n");
            return ; 
        }
        for(int i=front; i<=rear; i++)
            System.out.print(Queue[i]+" ");
            System.out.println();
    }
}
public class Queueusingarray{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Array Queue: ");
        System.out.println("Enter Size of Integer Queue ");
        int n = scan.nextInt();

        Queueimplemenatation q = new Queueimplemenatation(n);
        System.out.println("QUEUE OPERATIONS -->");
        System.out.println("\nINSERT :");
        for(int i=0;i<n;i++){
        q.insert(scan.nextInt());
        }
        q.display();



        System.out.println("\nREMOVE :");
        System.out.println("Removed Element = " +q.remove());
        q.display();

        System.out.println("\nPEEK :");
        System.out.println("Peek Element = " +q.remove());

        System.out.println("\nEmpty status = "+q.isEmpty());

        System.out.println("\nFull status = "+q.isFull());

        System.out.println("\nSize = "+ q.getSize());
    
        q.display();
    }
}