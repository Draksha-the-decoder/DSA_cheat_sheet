import java.util.*;
class subset{
    public static void main(String args[])
    {
        String str = "abac";
        // ArrayList<String> arr = new ArrayList<>();
        Set<String> arr = new HashSet<>();
        subsets(str,0,arr);
        System.out.println(arr);
        
    }
    static void subsets(String str,int pos,Set<String> arr)
    {
        if(pos>=str.length())
        {arr.add(str);return;}
        subsets(str,pos+1,arr);
        subsets(str.substring(0,pos)+str.substring(pos+1),pos,arr);
    }

    static void subsets(String str,int pos,ArrayList<String> arr)
    {
        if(pos>=str.length())
        {arr.add(str);return;}
        subsets(str,pos+1,arr);
        subsets(str.substring(0,pos)+str.substring(pos+1),pos,arr);
    }
}