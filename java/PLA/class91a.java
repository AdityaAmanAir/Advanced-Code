public class class91a {
    public static void main(String args[]){
        int a =25;
        int b=0;
        int c=1;
        while(a>0){
            if(a%2==1){
                b+=c;
            }a/=2;
            
            c*=10;
        }
        System.out.println(b);
    }
}
