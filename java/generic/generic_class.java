class generic_class <T>
{
    private T a[];
    generic_class(T a[])
    {
        this.a=a;
    }
    T getData(int i)
    {
        return a[i];
    }
    void print()
    {
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
    void reverse()
    {
        int j=a.length-1;
        for(int i=0;i<j;i++)
        {
            T temp;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
    }    
}
class reverse_array
{
    public static void main (String args[])
    {
        System.out.println("welcome");
        Integer b[]={1,2,3};
        generic_class<Integer> obj1=new generic_class<Integer>(b);
        obj1.print();
        obj1.reverse();
        obj1.print();

        String c[]={"abc","def","ijk"};        
        generic_class<String> obj2=new generic_class<String>(c);
        obj2.print();
        obj2.reverse();
        obj2.print();
    }
}