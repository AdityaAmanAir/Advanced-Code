//Palandromic binary number
public class class91b {
    public static void main(String args[]){
        int a = 1101001011;
        int[] b= {1,1,0,1,0,1,1};
        int len=7;
        for(int i=0; i<len/2;i++){
            if(b[i]!=b[len-i-1]){
                System.out.println("Not Palandromic!");
                len =-1;
                break;
            }
        }if(len!=-1){
            System.out.println("Palandromic!");
        }
    }
}
