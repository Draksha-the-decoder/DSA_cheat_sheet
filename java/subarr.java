import java.util.*;
class subarr{
    public static void main(String args[])
    {
       int arr[] ={1,2,2,3}; 
       ArrayList<String> ans = new ArrayList<>();
       ans.add("");
       for(int i=0;i<arr.length;i++)
       {
        int l = ans.size();
        for(int j=0;j<l;j++)
            ans.add(ans.get(j)+arr[i]);
       }
       System.out.println(ans);
    //    [, 1, 2, 12, 2, 12, 22, 122, 3, 13, 23, 123, 23, 123, 223, 1223]

        Set<String> set = new HashSet<>(ans); // Convert ans to a Set to remove duplicates
        ArrayList<Integer> result = new ArrayList<>();
         for (String ele : set)
         { 
            if(!ele.isEmpty())
            result.add(Integer.parseInt(ele)); 
         }
        System.out.println(result);

       
    //    ArrayList<Integer> unique=new ArrayList<>();
    //    for (int i=1;i<ans.size();i++) {
    //     int n=Integer.parseInt(ans.get(i));
    //     boolean add =true;
    //     for(int ele:unique)
    //         if(n==ele) add=false;
    //     if(add)  unique.add(n);      
    // }
    // System.out.println(unique);

    //    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    //    for(int i=0;i<arr.length;i++)
    //    {
    //     ArrayList<Integer> row1 = new ArrayList<>();
    //     row1.add(arr[i]); ans.add(row1);      
    //     int l = ans.size()-1;        
    //     for(int j=0;j<l;j++)
    //     {
    //         ArrayList<Integer> row = new ArrayList<>(ans.get(j));
    //         row.add(arr[i]);
    //         ans.add(row);
    //     }            
    //    }
    //    System.out.println(ans);
       
    //     Set<List<Integer>> uniqueSubsets = new HashSet<>(ans);  // Convert ans to a Set to remove duplicates
    //     ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    //     for (List<Integer> subset : uniqueSubsets) 
    //         result.add(new ArrayList<>(subset));
    //     System.out.println(result);
        // [[1], [1, 2, 2], [2], [2, 2], [1, 2, 3], [1, 2], [3], [2, 3], [2, 2, 3], [1, 3], [1, 2, 2, 3]]
    }
}