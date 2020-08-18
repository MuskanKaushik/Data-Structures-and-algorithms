import java.util.Scanner;
public class circular_queue {
    int size = 5;
    int front,rear;
    int items[] = new int[size];

    circular_queue(){
        front = -1;
        rear = -1;
    }
    boolean isFull(){
        if(front == 0 && rear == size-1){
            return true;
        }
        if(front==rear+1){
            return true;
        }
        return false;
    }
    
    boolean isEmpty(){
        if(front == -1)
        return true;
        else
        return false;
    }

    //Inserting the element
    void enQueue(int ele) {
        if (isFull()) {
          System.out.println("Queue is full");
        } 
        else 
        {
          if (front == -1)
            front = 0;
          rear = (rear + 1) % size;
          items[rear] = ele;
          System.out.println("\nInserted element: "+ele);
        }
      }

    //deleting a element
    int deQueue() {
        int ele;
        if (isEmpty()) {
          System.out.println("Queue is empty");
          return (-1);
        }
        else {
          ele = items[front];
          if (front == rear) {
            front = -1;
            rear = -1;
          } 
          else {
            front = (front + 1) % size;
          }
          return (ele);
        }
      }

      void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
          System.out.println("Empty Queue");
        } 
        else {
         // System.out.println("\nFront -> " + front);
          System.out.println("\nItems -> ");
          for (i = front; i != rear; i = (i + 1) % size)
            System.out.print(items[i] + " ");
          System.out.println(items[i]);
         // System.out.println("Rear -> " + rear);
        }
      }

    public static void main(String[] args){

        System.out.println("CIRCULAR QUEUE: ");

        circular_queue q = new circular_queue();

        System.out.println("Insert the elements -->");
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.display();

        System.out.println("\nDeleting the element -->");
        int a =  q.deQueue();
        if (a != -1) {
            System.out.println("Deleted Element is " + a);
          }
        q.display();

        q.enQueue(8);
        q.display();
       


       
    }
    
}