import java.util.*;
class quicksort{
    public static void main(String args[])
    {
        int arr[]={3,1,2,1,4,5,6,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int start,int end)
    {
        if(start>=end) return;
        int partition = partition(arr,start,end);
        sort(arr,start,partition-1);
        sort(arr,partition+1,end);
        System.out.println("sort "+Arrays.toString(arr)+" "+partition);
    }
    static int partition(int[] arr,int start,int end)
    {   
        int pivot=start;
        int i=start,j=end;
        while(i<j)
        {
            while (arr[i]<=arr[pivot] && i<end) i++;
            while (arr[j]>arr[pivot] && j>start) j--; 
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else break;
        }         
        int temp = arr[pivot];   
        arr[pivot]=arr[j];
        arr[j]=temp;
        return j;       
    }
}