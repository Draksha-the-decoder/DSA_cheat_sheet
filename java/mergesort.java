import java.util.*;
class mergesort{
    public static void main(String args[])
    {
        int arr[]={1,2,98,4,8,12,16,89,94,100};
        arr=sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int mid = (start+end)/2;
            int arr1[] = sort(arr,start,mid);
            int arr2[] = sort(arr,mid,end);
            arr= merge(arr1,arr2);
        }
        return arr;
    }
    static int[] merge(int[] arr1,int[] arr2)
    {
        int ans[]=new int[arr1.length+arr2.length];int c1=0,c2=0,c=0;
        int i =Math.min(arr1.length,arr2.length);
        while(c1<i && c2<i)
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
        System.out.println("merge "+Arrays.toString(ans));
        return ans;

    }
}