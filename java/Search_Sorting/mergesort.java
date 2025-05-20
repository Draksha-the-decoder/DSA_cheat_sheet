import java.util.*;
class mergesort{
    public static void main(String args[])
    {
        int arr[]={1,2,98,4,8,12,16,89,8,94,100};
        arr=sort(arr,0,arr.length-1);
        // arr=sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int mid = (start+end)/2;
            int arr1[] = sort(arr,start,mid);
            int arr2[] = sort(arr,mid+1,end);
            return merge(arr1,arr2);
        }
        return new int[]{arr[start]};
    }
    static int[] sort(int[] arr)
    {
        if(arr.length == 1)  {return arr;}
            int mid = arr.length/2;
            int[] arr1 = sort(Arrays.copyOfRange(arr,0,mid));
            int[] arr2 = sort(Arrays.copyOfRange(arr,mid,arr.length));
            return merge(arr1,arr2);
    }
    static int[] merge(int[] arr1,int[] arr2)
    {
        int ans[]=new int[arr1.length+arr2.length];int c1=0,c2=0,c=0;
        while (c1 < arr1.length && c2 < arr2.length)
        {
            if(arr1[c1]<arr2[c2])
            ans[c++]=arr1[c1++];
            else
            ans[c++]=arr2[c2++];
        }
        while(c1<arr1.length)
        ans[c++]=arr1[c1++];
        while(c2<arr2.length)
        ans[c++]=arr2[c2++];     
        // System.out.println("arr1 "+Arrays.toString(arr1));
        // System.out.println("arr2 "+Arrays.toString(arr2));   
        // System.out.println("merge "+Arrays.toString(ans));
        return ans;
    }
}