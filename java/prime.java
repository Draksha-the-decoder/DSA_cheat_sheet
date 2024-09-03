
class prime {
    public static void main(String args[]) {        
        int n = 15;
        boolean[] arr = new boolean[n+1];//initially all false
        seive_of_eratosthenes(arr,n);
        // for(int i=0;i<=n;i++)
        //     arr[i]=isprime(i);
        for(int i=1;i<=arr.length;i++)
            System.out.println(i+" "+arr[i]);


    }
    static void seive_of_eratosthenes(boolean[] primes,int n)
    {
        for(int i=0;i<=n;i++)
        primes[i]=true;//consider all prime
        for(int i=2;i<=n;i++) 
        {
            if(primes[i])
            {
                for(int j=i*2;j<=n;j=j+i)
                primes[j]=false;//not prime
            }
        }

    }
    static boolean isprime(int n)
    {
        for(int i=2;i*i<=n;i++)
        if(n%i==0)
        return false;
        return true;
    }
}
