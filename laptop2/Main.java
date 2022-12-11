package com.laptop2;

public class Main {
    public static void main(String[] args) {
        LaptopBuilder acer = new AcerBuilder();
        ComputerEngineer engineer = new ComputerEngineer(acer);
        engineer.createLaptop();

        Laptop lap = engineer.getLaptop();

        System.out.println("Product: " + lap);
    }
}
