public class frequency_sort 
{
    public static void main(String[] args)
    {
        int arr[] = {2,2,1,4,5,6,3,6,1,1,3,1,4,7,4,3};
        int a[] = new int[10];
        int b[] = new int[10];
        int arr1[] = new int[arr.length];
        int arr2 =0;

        //initially filling the array a and b with zero.
        for(int i=0;i<10;i++){
            a[i]=0;
        }

        for(int i=0;i<10;i++){
            b[i]=0;
        }

        //printing the the given array
        System.out.println("Given array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        //frequency array of the given array
        for(int i=0;i<arr.length;i++){
            a[arr[i]] +=1;
        }

        //printing the frequency array of the given array
        System.out.println("Frequency array of Given array is:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");

        //sub frenquency array
        System.out.println("Sub frequency array: ");
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[a[i]] +=1;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(b[i] + " ");
        }
        
        for(int i=b.length-1;i>=0;i--)
        {
            if(b[i]>0)
            {
                int temp = i;
                    for(int j=0;j<a.length;j++)
                {
                    if(a[j]==temp)
                    {
                        for(int x=temp;x>0;x--)
                        {
                            arr1[arr2] = j;
                            arr2++;
                        }
                    }
                }
            }
        }
 System.out.println("\n");
 System.out.println("Sort array on the base of frequency:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
}
    