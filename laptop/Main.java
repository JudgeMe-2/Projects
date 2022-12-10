package com.laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new LaptopBuilder().Ram(8).Brand("Dell").build();
        System.out.println(laptop);
    }
}
