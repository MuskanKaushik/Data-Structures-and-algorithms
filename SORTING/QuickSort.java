public class QuickSort{

    void quickSort(int[] array, int left, int right) 
        {
        if (array == null || array.length == 0){
            return;
        }
         
        if (left >= right){
            return;
        }
 
        int middle = left + (right - left) / 2;
        int pivot = array[middle];
 
        int i = left, j = right;
        while (i <= j) 
        {
            while (array[i] < pivot) 
            {
                i++;
            }
            while (array[j] > pivot) 
            {
                j--;
            }
            
            if (i <= j) 
            {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (left < j){
            quickSort(array, left, j);
        }
        if (right > i){
            quickSort(array, i, right);
        }
    }
     
    void swap (int array[], int left, int right)
    {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) 
    {
        int[] array = { 12, 13, 24, 10, 3, 6, 90, 70 };
        int n = array.length;
        QuickSort obj = new QuickSort();
        System.out.println("Original Array: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        
        obj.quickSort( array, 0, array.length - 1 );
 
        System.out.println("\nSorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
 
       
}
    
