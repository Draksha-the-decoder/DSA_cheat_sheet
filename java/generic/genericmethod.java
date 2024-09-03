class genericmethod
{
    public static void main (String args[])
    {
        System.out.println("welcome");
        //non static
        genericmethod obj = new genericmethod();
        obj.print(101);
        obj.print("draksha");

        //for static
        swap(99,66.5);//diff data types  

        // variable arguments for array    
        // int x[]={1,2,3};
        // int y[]={};
        // varargs(x);
        //variable arguments for ellipse and object
        varargs(1,true,"Richa",1.0);
    }
    <T> void print(T t)
    {
        System.out.println(t.getClass().getName()+" : "+ t);
    }
    static <T> void swap(T x,T y)
    {
        T temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println(x.getClass().getName()+" : "+ x);
        System.out.println(y.getClass().getName()+" : "+ y);
    }
    static void varargs(Object ...v)
    {
        System.out.println("no of args"+ v.length);
        for(Object i:v)
        System.out.println(i+" ");
    }
}