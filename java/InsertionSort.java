import java.util.*;
class InsertionSort {
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
        int n = arr.length;
        for (int i = 0; i < n-1; i++) 
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                break;
                System.out.println(Arrays.toString(arr)+" "+i+" "+j);
            }
            System.out.println();
        }
    }
};

