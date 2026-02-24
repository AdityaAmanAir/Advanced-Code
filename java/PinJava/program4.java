//Write a Program to implement method overloading in single Class in java.

class Overloading {
    void display(int a) {
        System.out.println("Integer value: " + a);
    }
    
    void display(double b) {
        System.out.println("Double value: " + b);
    }
    
    void display(String c) {
        System.out.println("String value: " + c);
    }
}

public class program4 {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.display(10);
        obj.display(10.5);
        obj.display("Hello");
    }
    
}

//how q3 and q4 are different ?
// 3 Write a Program to implement method overloading by using static
// method in java.
// 4 Write a Program to implement method overloading in single class in
// java. 
// In question 3, we are implementing method overloading using static methods, which means that the methods can be called without creating an instance of the class. In question 4, we are implementing method overloading in a single class, which means that we are defining multiple methods with the same name but different parameters within the same class. The main difference is that in question 3, the methods are static and can be called directly using the class name, while

