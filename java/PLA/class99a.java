

public class class99a {
    public static void main(String args[]){

int arr[]= {-3, 5, 3, 1, 2, 6, -4, 2};
int len = arr.length;
int sum=0;
        for (int i =0; i<len;i++){
            sum+=arr[i];
        }
int sum2=0;    

    for (int j =0; j<len;j++){
            if(sum2==sum/2){
                System.out.println(j+1);
                sum2=-1;
                break;
            }
        }
        if(sum2==-1){
            System.out.println(sum2);
        }
}
}
