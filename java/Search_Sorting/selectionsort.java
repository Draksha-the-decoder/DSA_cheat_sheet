import java.util.*;
class selectionsort{
    public static void main(String args[])
    {
        int[] arr = {6,1,4,3,2,1};
        pattern(arr,0,0,0);
        System.out.println(Arrays.toString(arr)); 
    }
    static void pattern(int[] arr, int i,int j,int maxind)
    {
        if(i<arr.length-1)
        {
            if(j<=arr.length-i-1)
            {
                if(arr[j]>=arr[maxind])
                pattern(arr,i,j+1,j);
                else
                pattern(arr,i,j+1,maxind);
            }
            else{
                 int temp=arr[arr.length-i-1]; arr[arr.length-i-1]=arr[maxind]; arr[maxind]=temp;
                 pattern(arr,i+1,0,0);
            }
           
        }

    }
}