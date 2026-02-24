//Write a Program to implement simple inheritance in java.

class Parent {
    int varA = 100;
    void displayParent() {
        System.out.println("This is the parent class.");
        System.out.println("Value of varA in Parent: " + varA);
    }
}

class Child extends Parent {
    int varB = 200;
    void displayChild() {
        System.out.println("This is the child class.");
        System.out.println("Value of varA inherited from Parent: " + varA);
        System.out.println("Value of varB in Child: " + varB);
    }
}

public class program5 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayParent();
        obj.displayChild();
    }
}
