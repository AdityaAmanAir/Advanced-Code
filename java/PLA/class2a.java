   
import java.util.*;
class class2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        long c = sc.nextLong();
        boolean d =sc.nextBoolean();
        // char e = sc.next().c
        String e = sc.next();
        String f = sc.nextLine();
        // sc.nextLine(); //i need one line too , if it was not given , it will skip the text, (need a fresh memory buffer)
        sc.next();
        String g = sc.next();
        sc.next(); //i need one line too , if it was not given , it will skip the text, (need a fresh memory buffer)
        String h = sc.next();
        String i = sc.nextLine();
        sc.next();
        String j = sc.nextLine();
        char k = sc.next().charAt(0);
      

        System.out.print("----------\n");
        System.out.println("You entered: " +a);
        System.out.println("You entered: " +b);
        System.out.println("You entered: " +c);
        System.out.println("You entered: " +d);
        System.out.println("You entered: " +e);
        System.out.println("You entered: " +f);
        System.out.println("You entered: " +g);
        System.out.println("You entered: " +h);
        System.out.println("You entered: " +i);
        System.out.println("You entered: " +j);
        System.out.println("You entered: " +k);
    }
}
