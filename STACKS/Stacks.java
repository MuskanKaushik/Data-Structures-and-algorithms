import java.util.EmptyStackException;

public class Stacks {
    private Node top;
    private int length;

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public Stacks(){
        top = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
       // System.out.print(top+" ");
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args){
        Stacks s = new Stacks();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
       // s.pop();
    }
}