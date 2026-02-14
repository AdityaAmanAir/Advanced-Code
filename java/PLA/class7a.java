// Segmented Sieve (L,H)

import java.util.*;
public class class7a{

    public static int[] simple_sieve (int n){
        boolean[] primeSet = new boolean[n+1];
        for (int i =2; i<=n;i++){
            primeSet[i]=true;
        }
        for(int i =2; i<=n;i++){
            if(primeSet[i]==false){
                continue;
            }
            for(int j=i+i;j<=n;j+=i){
                primeSet[j]=false;
            }
        }
        int count =0,j=0;
        for(int i=2;i<=n;i++){
            if(primeSet[i]==true){
            count++;
            }
        int[] prime = new int[count];
        for(int ii=2;ii<=n;i++){
            if(primeSet[ii]==true){
            prime[j++]=ii;
            }
        }
        
        return prime;
    }

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for which you want to find total numbers of prime : ");
        int n = sc.nextInt();

        int sqrtn =(int)(Math.sqrt(n));

        int k = n-sqrtn+1;
        boolean[] findprime = new boolean[k];
        

        }



    }
}