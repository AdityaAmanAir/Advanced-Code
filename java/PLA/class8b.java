    //Euler's phi algorithm

//Properties
// Q(q)= q-1
// Q(p*q)= Q(p)*Q(q)    
// Q(p^q)= p^q=p^(q-1)

public abstract class class8b {

    public static int phi(int n){
        int result = n;
        int originalN = n;
        
        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                while (n % p == 0) {
                    n /= p;
                }
                result -= result / p;
            }
        }
        if (n > 1) {
            result -= result / n;
        }
        
        return result;
    }
    
    public static void main(String args[]){
        int lol = phi(40);
System.out.println(lol+" ");
    }
}
