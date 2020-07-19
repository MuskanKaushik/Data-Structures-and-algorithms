//import java.util.*;
import java.util.Scanner;
class Java_Operations{
    static Scanner scan = new Scanner(System.in);
    
    public void insert_at(int array[]){
        
        int s = array.length;
        int index;
        System.out.println("Enter the index:");
        index = scan.nextInt();
        int element;
        System.out.println("Enter the element you want to insert: ");
        element = scan.nextInt();
        int array2[] = new int[s+1];
        
        for(int i=s-1; i>= index; i--){
            array2[i+1]=array[i];
        }
        s=s+1;
        array2[index]=element;
        for(int i=index-1;i>=0;i--){
            array2[i]=array[i];
        }
        System.out.println("Final array: ");
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }

    public void insert_before(int array[]){

        int s = array.length;
        int t_element;
        System.out.println("Enter the element before which you want to insert element: ");
        t_element = scan.nextInt();
        int element;
        System.out.println("Enter the element you want to insert: ");
        element = scan.nextInt(); 
        int array2[] = new int[s+1];
        int t_index = 0;

        for(int i=0;i<s;i++){
            if(array[i]==t_element){
                t_index = i;
            }
        }
        for(int i=0; i<t_index;i++){
            array2[i]=array[i];
        }
        array2[t_index]=element;
        for(int i=t_index+1; i<array2.length;i++){
            array2[i]=array[i-1];
        }
        System.out.println("Final array: ");
       for(int i=0;i<array2.length;i++){
        System.out.println(array2[i]);
    }
    }

    public void insert_after(int array[]){
        int s = array.length;
        int t_element;
        System.out.println("Enter the element after which you want to insert element: ");
        t_element = scan.nextInt();
        int element;
        System.out.println("Enter the element you want to insert: ");
        element = scan.nextInt(); 
        int array2[] = new int[s+1];
        int t_index = 0;

        for(int i=0;i<s;i++){
            if(array[i]==t_element){
                t_index = i;
            }
        }
        for(int i=0; i<=t_index;i++){
            array2[i]=array[i];
        }
        array2[t_index+1]=element;
        for(int i=t_index+2;i<array2.length;i++){
            array2[i]=array[i-1];
        }
        System.out.println("Final array: ");
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
    public void delete(int array[]){
        int s = array.length;
        int array2[] = new int[s-1];
        int t_element;
        System.out.println("Enter the element which you want to delete");
        t_element = scan.nextInt();
        int t_index=0;
        for(int i=0;i<s;i++){
            if(array[i]==t_element){
                t_index = i;
            }
        }
        for(int i=0;i<t_index;i++){
            array2[i]=array[i];
        }
        for(int i =t_index;i<array2.length;i++){
            array2[i]=array[i+1];
        }
        System.out.println("Final array: ");
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }

    public void delete_from(int array[]){
        int s = array.length;
        int index;
        System.out.println("Enter the index:");
        index = scan.nextInt();
    
        int array2[] = new int[s-1];
        for(int i=0, k=0 ;i<s;i++){
            if(i==index){
                continue;
            }
            else{
                array2[k++]=array[i];
            }
        }
        System.out.println("Final array: ");
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
    public static void main(String[] args){
        Java_Operations op = new Java_Operations();
        int size,choice;
        System.out.println("Enter the size of the array: ");
        size = scan.nextInt();
        int array[]= new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i= 0;i<size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Array:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("Choose the operations from below which you want to perform by entering the choice from 1-5: ");
        System.out.println("1. Insertion at a given position");
        System.out.println("2. Insertion before a given number");
        System.out.println("3. Insertion after a given number");
        System.out.println("4. Deletion of a given value");
        System.out.println("5. Deletion from a given position");
        choice = scan.nextInt();
        System.out.println("You choose " + choice);
        if(choice<1 && choice>5){
            System.out.println("Invalid Choice");
            
        }
        else
        {
            switch(choice)
            {
                case 1:
                    op.insert_at(array);
                    break;
                case 2:
                    op.insert_before(array);
                    break;
                case 3:
                    op.insert_after(array);
                    break;
                case 4:
                   op.delete(array);
                   break;
                case 5:
                    op.delete_from(array);
                    break;
            }
        }
    }
    
}
