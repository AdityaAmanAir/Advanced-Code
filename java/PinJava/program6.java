//Write a Program to implement method overriding in java.

class Animal {
    String category = "Cats";

    public Animal() {
        System.out.println("This is the constructor of the Animal class." + category);
    }
    
    public void sound() {
        System.out.println("ROAARRR");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        super.sound(); 
        System.out.println("Meow..");
    }
}

public class program6 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); 

        Cat myCat = new Cat();
        myCat.sound(); 
    }
}
