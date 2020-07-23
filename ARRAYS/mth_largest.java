import java.util.*;
public class mth_largest {
    static boolean present(int [] arr, int x){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                return true;
            }
        }
        return false;
    }
    static int find(int[] arr, int m){
        Arrays.sort(arr);
        return arr[arr.length-m];
    }
    static int[] delete(int[] array, int t) {
        int n = array.length;
        int[] Arr2 = new int[n-1];
        int t_Index = -1;
        for (int i=0;i<n;i++){
            if (array[i]==t) {
                t_Index=i;
            }
        }
        if (t_Index!=-1) {
            for (int i=0;i<t_Index;i++){
                Arr2[i]=array[i];
            }
            for (int i=t_Index;i<Arr2.length;i++){
                Arr2[i]=array[i+1];
            }
            return delete(Arr2, t);   
        }
        else return array;
    }
    static int[] r_Duplicate(int[] arr){
        int[] temp = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            if (present(temp, arr[i])){
                continue;
            } else {
                temp[i]=arr[i];
            }
        }
        temp = delete(temp, 0);

        return temp;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Enter m:  ");
        int m = scan.nextInt();
        int[] newArr = r_Duplicate(array);
        int num = find(newArr, m);
        System.out.println(m + "th largest number in array is: " + num);
        scan.close();
    }
}