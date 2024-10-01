import java.util.*;
class remove_a{
    public static void main(String args[])
    {
        String str = "abaappabapplea";
        String ans=remove_app_not_apple(str);
        System.out.println(ans);
    }
    static String remove_app_not_apple(String str)
    {
        if(str.isEmpty())
        return "";
        if(str.startsWith("app") && !str.startsWith("apple"))
        return (remove_app_not_apple(str.substring("app".length())));
        return (str.charAt(0)+remove_app_not_apple(str.substring(1)));    
    }

    static String removeString(String str)
    {
        if(str.isEmpty())
        return "";
        if(str.startsWith("string"))
        return (removeString(str.substring("string".length())));
        return (str.charAt(0)+removeString(str.substring(1)));    
    }

    static String remove(String str)
    {
        if(str.isEmpty())
        return "";
        if(str.charAt(0)=='a')
        return (remove(str.substring(1)));
        return (str.charAt(0)+remove(str.substring(1)));    
    }
}