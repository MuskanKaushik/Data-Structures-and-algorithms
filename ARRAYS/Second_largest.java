import java.util.Scanner;
public class Second_largest{
    static int[] sum(int[] array, int k)
    {
        int[] s_array = new int[array.length-k+1];
        for (int i=0;i<s_array.length;i++){
            s_array[i] = 0;
        }
        for (int i=0;i<=(array.length-k);i++){
            for (int j=i;j<(i+k);j++){
                s_array[i] += array[j];
            }
        }
        return s_array;
    }
    
    static int smax(int[] a){
        int max=-1;
        int maxIndex=0;
        int s_max=-1;
        int sm_Index=-1;
        for (int i=0;i<a.length;i++){
            if (a[i]>=max){
                s_max = max;
                sm_Index = maxIndex;
                max=a[i];
                maxIndex = i;
            } 
            else if (a[i]>s_max)
            {
                s_max = a[i];
                sm_Index = i;
            }
        }
        return sm_Index;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the Array: ");
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter k:");

        int k = sc.nextInt();

        int[] sarr = sum(array,k);
        int smsi = smax(sarr);
        int[] karr = new int[k];
        int j = 0;
        for (int i=smsi;i<smsi+k;i++){
            karr[j]=array[i];
            j++;
        }

        int sum =0;
        System.out.println(k + " elements with second max sum are:");
        for (int i=0;i<k;i++){
            System.out.print(karr[i] + " ");
            sum = sum + karr[i];
        }
        System.out.println();
        System.out.println("Sum:"+sum);
        sc.close();
    }
}
