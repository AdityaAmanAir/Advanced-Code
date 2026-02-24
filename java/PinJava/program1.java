//Write a program to implement constructor in java.

class ClassA {
    int varA =100;
    int varB;
    String name;

    public ClassA(){
        int varB =404;
        name="Aditya Aman";
        System.out.println("Hello! "+name+" I am (User-defined No-Argumen) Default constructor and i have been invoked because you have create a new object!");
    }

    public ClassA(int a){
        int varA =a;
        System.out.println(" I am Parameterized constructor and i have been invoked because you have create a new object with parameters!");
    }
}


public class program1 {
    public static void main(String args[]){
        ClassA obj = new ClassA();
        ClassA obj2 = new ClassA(69);
    }
}
