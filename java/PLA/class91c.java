
import java.util.Scanner;

public class class91c {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;
        int c=1;
        while(a>0){
            if(a%2==1){
                b+=c;
            }a/=2;
            
            c*=10;
        }
        String d = String.valueOf(b);
        System.out.println(d);
        int len=d.length();
        for(int i=0; i<len/2;i++){
            if(d.charAt(i)!=d.charAt(len-i-1)){
                System.out.println("Not Palandromic!");
                len =-1;
                break;
            }
        }if(len!=-1){
            System.out.println("Palandromic!");
        }
    }
}
