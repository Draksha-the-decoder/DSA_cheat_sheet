import java.util.*;
class arraylist
{
    public static void main (String args[])
    {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        arr.add(51);
        arr.add(52);
        System.out.println(arr);

        ArrayList <Integer> arr2 = new ArrayList<Integer>(arr);
        arr2.add(53);
        arr2.add(54);
        System.out.println(arr2);
        arr.add(55);
        arr2.add(56);
        System.out.println(arr);
        System.out.println(arr2);

        arr2.addAll(arr);
        System.out.println(arr2);

        arr2.add(3,99);//normal insertion
        System.out.println(arr2);
        
        arr2.set(4,99);//replacement
        System.out.println(arr2);

    }
}
// [51, 52]
// [51, 52, 53, 54]
// [51, 52, 55]
// [51, 52, 53, 54, 56]
// [51, 52, 53, 54, 56, 51, 52, 55]