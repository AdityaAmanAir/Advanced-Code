//Write a program to implement Class concept in java.

class Car {
    String brand;
    String model;
    int year;
    String color;

    private String headCompany = "BMW Group";
    
    void startEngine() {
        System.out.println(brand + " " + model + " engine started");
    }
    
    void accelerate() {
        System.out.println(brand + " " + model + " is accelerating");
        System.out.println("-------------------");
    }
    
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Head Company: " + headCompany);
    }
}    
public class program2 {
    public static void main(String args[]){
        Car BMW = new Car();
        Car MINI = new Car();
        Car Rolls_Royce = new Car();

        BMW.brand="BMW";
        BMW.model="M3";
        BMW.year=2025;
        BMW.color="BLACK";

        MINI.brand="MINI";
        MINI.model="Cooper";
        MINI.year=2024;
        MINI.color="WHITE";

        Rolls_Royce.brand="Rolls-Royce";
        Rolls_Royce.model="Phantom";
        Rolls_Royce.year=2023;
        Rolls_Royce.color="SILVER";

        System.out.println("Car 1 Details:");
        BMW.displayInfo();
        BMW.startEngine();
        BMW.accelerate();

        System.out.println("Car 2 Details:");
        MINI.displayInfo();
        MINI.startEngine();
        MINI.accelerate();

        System.out.println("Car 3 Details:");
        Rolls_Royce.displayInfo();
        Rolls_Royce.startEngine();
        Rolls_Royce.accelerate();
    }
}
