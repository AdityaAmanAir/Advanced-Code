//Simple Sieve

import java.util.*;
public class class6b {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
        for(int i=2;i<=n;i++){
            if(primeSet[i]==true){
            System.out.println((i));
            }
        }
    }
}
