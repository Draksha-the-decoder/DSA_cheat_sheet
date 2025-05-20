class addfrac{
    public static void main(String args[])
    {
       int n1=4,d1=5,n2=6,d2=9;
       int LCM = Math.max(d1,d2);
       while(!((LCM % d1==0) && (LCM % d2==0)))
       LCM++;       
       System.out.println("denomi "+LCM);
       System.out.println("numer "+((n1*(LCM/d1))+(n2*(LCM/d2))));  
    }
}