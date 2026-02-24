//Write a Program to implement method overloading by using static method in java

public class program3 {
    static void display(int a) {
        System.out.println("Integer value: " + a);
    }
    
    static void display(double b) {
        System.out.println("Double value: " + b);
    }
    
    static void display(String c) {
        System.out.println("String value: " + c);
    }

    public static void main(String[] args) {
        display(10);
        display(10.5);
        display("Hello");
    }
}