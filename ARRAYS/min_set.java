import java.util.Arrays; 
import java.util.Scanner;
public class min_set {
    
    public static void main(String []args){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int []array = new int[n];

        System.out.println();
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("elements of the array: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        //System.out.println("Enter the group: ");
        int k;
        System.out.println("Enter the size of subset: ");
        k = sc.nextInt();
        System.out.println();

        int []positive = new int[10];
        Arrays.fill(positive,0);
        int []negative = new int[10];
        Arrays.fill(negative,0);
        for(int i = 0 ; i<array.length ; i++){
            if(array[i] == 0 ){
                positive[0] += 1;
            }
            else if(array[i] !=0 && array[i]>0)
            {
                positive[array[i]] += 1;
            }
            else if(array[i] !=0 && array[i]<0)
            {
             negative[-array[i]] += 1;   
            }
        }
        int t =0;
        System.out.println("Removing the duplicate elemenets ");  
        if(k>0){  
            for(int i = negative.length-1;i>0;i--)
            {
            if(negative[i]>0){
                t -= i;
               k--;
               System.out.println(i);
            }
            if(k==0) 
            break;
          
                
            }
        }
          if(k>0){
             for(int i = 0 ;i<positive.length;i++){
            if(positive[i]>0){
                t += i;
		        k--;
               System.out.println(i);
            }
            if(k==0)
            break;
            
            
          }
          }
        System.out.println();
        System.out.println("min sum:");
       System.out.println(t);
     }
}