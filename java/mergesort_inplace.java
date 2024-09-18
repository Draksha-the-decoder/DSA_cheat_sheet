import java.util.*;
class mergesort_inplace{
    public static void main(String args[])
    {
        int arr[]={3,1,2,4,1,5,2,6,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int start,int end)
    {
        if(start>=end) return;
        int mid = (start+end)/2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);
        System.out.println("sort "+Arrays.toString(arr)+start+" "+mid+" "+end);
    }
    static void merge(int[] arr,int start,int mid,int end)
    {
        int ans[]=new int[end-start+1];int c=0;
        int left=start, right=mid+1;
        while (left<=mid && right<=end)
        {
            if(arr[left]<arr[right])
            ans[c++]=arr[left++];
            else
            ans[c++]=arr[right++];
        }
        while(left<=mid)
        ans[c++]=arr[left++];
        while(right<=end)
        ans[c++]=arr[right++];   
        for(int i=start;i<=end;i++)
        arr[i]=ans[i-start];
    }
}