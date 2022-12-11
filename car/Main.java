package com.car;

public class Main {
    public static void main(String[] args) {
        CarBuilder honda = new HondaCarBuilder();
        Engineer engr = new Engineer(honda);

        engr.assembleCar();

        Car car = engr.getCar();

        System.out.println("Product: " + car);
    }
}
