import java.util.*;
public class class6a {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>1){
            boolean prime = true;
            for(int i =2; i<n;i++){
                if(n%i==0){
                    prime=false;
                    
                }
            }if(prime==true){
                System.out.println(n);
            }
            n--;
        }

    }
}
