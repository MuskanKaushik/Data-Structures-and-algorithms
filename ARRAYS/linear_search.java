//import java.util.*;
import java.util.Scanner;
class linear_search {
    static int l_search(int arr[], int n, int element){
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                return i;
            }
            else{
                return -1;
            }
        }

    }


    //linear_search ls = new linear_search();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,a;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int element;
        System.out.println("Enter the element you want to search: ");
        element = sc.nextInt();
        int[] arr = new int[n];
        System.out.println();
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Print the elements of the array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
         a = l_search(arr,n,element);
        if(a==-1){
            System.out.println("Element doesnot exist here!");
        }
        else{
            System.out.println("Element exist at position " +a);
        }
        sc.close();
    }
    
}