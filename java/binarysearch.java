class binarysearch{
    public static void main(String args[])
    {
        // int arr[]={1,4,5,6,8,9,7,11,13};
        // int ind=search(arr,0,arr.length-1,11);
        // System.out.println(ind);

        int arr[]={5,6,7,8,9,1,2,3};
        int ind=rotatedbs(arr,0,arr.length-1,11);
        System.out.println(ind);
    }
    static int rotatedbs(int[] arr,int start,int end,int target)
    {
        if(start>end)
        return -1;
        else
        {
            int mid = start + (end-start)/2;
            if(arr[mid]== target)
            return mid;
            if(arr[mid]>target){
                if(arr[start]<target) return rotatedbs(arr,mid+1,end,target);
                if(arr[mid]<arr[end])  return rotatedbs(arr,start,mid-1,target);

            }
            else{
                if(arr[end]>arr[mid])  return rotatedbs(arr,mid+1,end,target);
                if(arr[mid]<arr[end])  return rotatedbs(arr,mid+1,end,target);
            }      
        }

    static int search(int[] arr,int start,int end,int target)
    {
        if(start>end)
        return -1;
        else
        {
            int mid = start + (end-start)/2;
            if(arr[mid]== target)
            return mid;
            if(arr[mid]>target)
            return(search(arr,start,mid-1,target));
            return(search(arr,mid+1,end,target));
        }
    }
}