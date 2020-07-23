import java.util.Scanner;
import java.util.Arrays;
public class frequency_sort {
    static Scanner sc = new Scanner(System.in);
    private static int n;
    private static int array[];
    
    static void f_sort()
    {
        int[] freq_pos = new int[10];
        int[] freq_neg = new int[10];
        int[] t = new int[array.length];
        int mp,mn,mi,m,index;
        int x=0;
        for (int i=0;i<10;i++){
            freq_neg[i]=0;
            freq_pos[i]=0;
        }
        for (int i=0;i<n;i++){
            if (array[i]<0){
                freq_neg[0-array[i]]+=1;
            } else {
                freq_pos[array[i]]+=1;
            }
        }

        for (int i=20;i>=0;i--)
        {
            mp = m_Index(freq_pos);
            mn = m_Index(freq_neg);
            if (freq_pos[mp]>freq_neg[mn])
            {
                mi = mp;
                m = 1;
                index = freq_pos[mi];
            } 
            else 
            {
                mi = mn;
                m = -1;
                index = freq_neg[mi];
            }
            if (freq_neg[mn]==0 && freq_pos[mp]==0)
            {
                break;
            }
            
        for (int j=0;j<index;j++)
            {
                t[x]=m*mi;
                x++;
            }
            if (m==1)
            {
                freq_pos[m_Index(freq_pos)]=0;
            } 
            else 
            {
                freq_neg[m_Index(freq_neg)]=0;
            }
            
        }
        for (int i=0;i<n;i++)
        {
            array[i]=t[i];
        }
    }
    static int m_Index(int arr[]){
        int m=-1;
        int m_Index=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>m){
                m=arr[i];
                m_Index = i;
            }
        }
        return m_Index;
    }
    static void printing_Array() {
        System.out.println(Arrays.toString(array));   
    }
    public static void main(String[] args){
        
        n = sc.nextInt();
        array = new int[n];
        for (int i=0;i<n;i++)
            array[i]=sc.nextInt();
        f_sort();
        printing_Array();
    }
}