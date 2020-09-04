public class BubbleSort {
    public void bubblesort(int array[]){
        int temp;
        int n = array.length;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        int[] array = {12,67,32,45,16,5};
        int n;
        n = array.length;
        System.out.println("Original Array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }
        bs.bubblesort(array);
        System.out.println("\nSorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}