
public class limitANumberTo2Decimal {
    public static void main(String args[]){
        double a=23.4567;
        double aa=23.4567%.2f;
        a*=100;
        int b=(int)a;
        a=(double)b/100.0;
        System.out.println(a);
        System.out.println(aa);
        
    }
}