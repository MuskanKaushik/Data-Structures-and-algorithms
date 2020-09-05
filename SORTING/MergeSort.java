class MergeSort {
    void merge(int array[], int l, int m, int r) 
    { 
       
        int s1 = m - l + 1; 
        int s2 = r - m; 
  
        int LeftArray[] = new int[s1]; 
        int RightArray[] = new int[s2]; 
  
        for (int i = 0; i < s1; ++i) 
            LeftArray[i] = array[l + i]; 
        for (int j = 0; j < s2; ++j) 
            RightArray[j] = array[m + 1 + j]; 
  
        
        int i = 0;
        int j = 0; 
  
      
        int k = l; 
        while (i < s1 && j < s2) { 
            if (LeftArray[i] <= RightArray[j]) { 
                array[k] = LeftArray[i]; 
                i++; 
            } 
            else { 
                array[k] = RightArray[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < s1) { 
            array[k] = LeftArray[i]; 
            i++; 
            k++; 
        } 
  
        while (j < s2) { 
            array[k] = RightArray[j]; 
            j++; 
            k++; 
        } 
    } 
  
    void sort(int array[], int left, int right) 
    { 
        if (left < right) { 
             
            int middle  = (left + right) / 2; 
  
            sort(array, left, middle); 
            sort(array, middle + 1, right); 
  
            merge(array, left, middle, right); 
        } 
    }
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6, 7 }; 
  
        System.out.println("Given Array"); 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length - 1); 
  
        System.out.println("\nSorted array"); 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
}