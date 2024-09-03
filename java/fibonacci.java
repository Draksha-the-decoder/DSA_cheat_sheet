class fibonacci{
    public static void main(String args[])
    {
        int n=fib(7);
        System.out.println(n);
    }
    static int fib(int n)
    {
        if( n==1)
        return 1;
        if(n==0)
        return 0;
        else
        return fib(n-1)+fib(n-2);
    }
}