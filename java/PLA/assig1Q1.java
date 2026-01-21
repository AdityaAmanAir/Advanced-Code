import java.util.*;
public class assig1Q1{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int EvenCount=0, OddCount=0, n, takein;
        n=sc.nextInt();
        while(n>0){
            n--;
            takein=sc.nextInt();
            if(takein%2==0){
                EvenCount++;
            }else{
                OddCount++;
            }
        }
        System.out.println("Even Count: "+EvenCount+"\nOdd Count: "+OddCount);

    }
}