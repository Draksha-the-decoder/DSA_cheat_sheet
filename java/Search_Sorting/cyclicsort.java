
import java.util.*;
class cyclicsort {
    public static void main(String args[])
    {
        int arr[] = { 3, 5, 2, 1, 4};
        int n = arr.length;int i=0;
       while(i<n)
        {
            if(arr[i]!=i+1)
            {
                int temp = arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1] = temp;
            }
            else
            i++;
            System.out.println(Arrays.toString(arr)+" "+i);
        }   
    }
};

