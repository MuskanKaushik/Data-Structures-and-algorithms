public class InsertionSort {
    public void insertionsort(int array[]){
        int n = array.length;
        for(int i = 1; i<n; i++){
            int key = array[i];
            int j = i-1;

            while(j>=0 && array[j]>key){
                array[j + 1] = array[j];
                j=j-1;
            }
            array[j+1] = key;
        }
    }
    public static void main(String[] args){
        InsertionSort in = new InsertionSort();
        int[] array = {12,67,32,45,16,5};
        int n;
        n = array.length;
        System.out.println("Original Array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }
        in.insertionsort(array);
        System.out.println("\nSorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    }
    
