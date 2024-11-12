import java.util.*;
class permutation{
    public static void main(String args[])
    {
        String str = "abc";
        permu(str,0,arr);
        System.out.println(arr);
        
    }
    static void permu(String str,int pos,ArrayList<String> arr)
    {
        if(pos>=str.length())
        {arr.add(str);return;}
        permu(str,pos+1,arr);
        permu(str.substring(0,pos)+str.substring(pos+1),pos,arr);
    }
}