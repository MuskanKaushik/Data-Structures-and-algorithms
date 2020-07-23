import java.util.Arrays; 
//import java.util.Collections; 
//import java.util.*;
public class SUM_OF_SET{
     public static void main(String []args){
        int []array = {-5,-3,-1,-3,0,1,4,6,5,3};
        int k = 3;
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
          
        if(k>0){  
            for(int i = negative.length-1;i>0;i--)
            {
            if(negative[i]>0){
                t -= i;
               k--;
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
       System.out.println(t);
     }
}