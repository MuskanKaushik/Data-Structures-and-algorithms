public class SelectionSort {
    public void sort(int array[]){
        int temp;
        int n = array.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(array[j]<array[min]){
                    min = j;
                }
            } 
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }
    public static void main(String[] args){
        SelectionSort obj = new SelectionSort();
        int array[] = {60, 50, 20, 30 , 10, 40};
        int n = array.length;
        System.out.print("Original Array: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        obj.sort(array);
        System.out.print("\nSorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
    
}