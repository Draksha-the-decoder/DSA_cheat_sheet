class array
{
    public static void main (String args[])
    {
        System.out.println("welcome");
        array obj = new array();
        obj.insert();
        obj.delete();
        obj.print();
        obj.multiply();
        obj.add();
        obj.subtract();
        // obj.print(101);
        // obj.print("draksha");
        // swap(99,66.5);
        // varargs(1,true,"Richa",1.0);
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