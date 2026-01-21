import java.util.*;
public class assig1Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n,sum=0;
        n=sc.nextInt();
        if(n<0){
            n=-n;
        }
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
