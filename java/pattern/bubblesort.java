import java.util.*;
class bubblesort{
    public static void main(String args[])
    {
        int[] arr = {4,3,2,1};
        pattern(arr,0,0);
        System.out.println(Arrays.toString(arr)); 
    }
    static void pattern(int[] arr, int i,int j)
    {
        if(i<arr.length-1)
        {
            if(j<arr.length-i-1)
            {
                if(arr[j]>arr[j+1])
                {  int temp=arr[j]; arr[j]=arr[j+1]; arr[j+1]=temp; }
                pattern(arr,i,j+1);
            }
            else{
                 pattern(arr,i+1,0);
            }
           
        }

    }
}