
public class class5a {

    // Time Complexity :
    // o(1)
    // o(n)
    // o(o^2)
    // o(n^3)
    // o(2^n)
    // o(n!)
    // o(log n)

 public static void main(String arg[])   {
    int targ=8;
    int arr1[]={1,2,4,5,6,8,10,19,27,39,45,46,47,49,50,51,99,100};
    int end=17;
    int mid;
    int st=0;
    while(st<end){
        mid = (end+st)/2;
        if(arr1[mid]==targ){
            System.out.println("Found at : "+mid);
            break;
        }else if (arr1[mid]<targ){
            st =mid;
        }else if (arr1[mid]>targ){
            end =mid;
    }

 }
}
}