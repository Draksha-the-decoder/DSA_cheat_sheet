import java.util.*;
class quicksort{
    public static void main(String args[])
    {
        int arr[]={3,1,2,4,1,5,2,6,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int start,int end)
    {
        if(start<end){
        int partition = partition(arr,start,end);
        System.out.println("sort "+Arrays.toString(arr)+" "+partition);
        sort(arr,start,partition-1);
        sort(arr,partition+1,end);
        }        
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
                System.out.println("partition "+Arrays.toString(arr)+" "+i+" "+j);
            }
          
        }         
        int temp = arr[pivot];   
        arr[pivot]=arr[j];
        arr[j]=temp;
        System.out.println("partition "+Arrays.toString(arr)+" exchange with pos "+j+" range "+start+" to "+end);
        return j;      
         
    }
}