
class reverse {
    public static void main(String args[]) {

       int n = 1234;
       System.out.println(rev(n,(int)Math.log10(n)+1));
    }
    static int search(int n,int base)
    {
        if(n==0)
        return 0;
        System.out.println(n%10);
        return (n%10)*(int)(Math.pow(10,base-1)) + rev(n/10,base-1);
    }
}
