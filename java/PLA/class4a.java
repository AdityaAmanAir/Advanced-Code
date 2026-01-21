import java.util.*;
public class class4a {
    public static void main(String args[]){
        // for loop
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        System.out.println("-----");
        //Collection is a class present in util package
        //List is an interface
        //ArrayList is a class which implements List interface
        //LinkedList is a class which implements List interface
        Scanner sc =new Scanner(System.in);
        int arr[]={1,2,3,00,5};
        int arr2[]=new int[5];
        for (int i: arr){
            System.out.println(i);
        }
        System.out.println("-----");
        for(int j=0;j<arr2.length;j++){
            System.out.println(arr2[j]);
        }
        System.out.println("-----");
        int count =1;
        do { 
            System.out.println(++count);
        } while ((++count)<6);


    }
    
}
