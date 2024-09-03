class generic_bounded <T extends Number>
{
    private T a[];
    generic_bounded(T a[])
    {
        this.a=a;
    }
    double average()
    {
        double sum =0.0;
        for(int i=0;i<a.length;i++)
        sum = sum + (a[i]).doubleValue();
        return sum/a.length;
    }
    public static void main (String args[])
    {
        System.out.println("welcome");
        Double b[]={1.0,2.0,3.0};
        generic_bounded<Double> obj=new generic_bounded<Double>(b);
        double d=obj.average();
        System.out.println(d);
    }
}