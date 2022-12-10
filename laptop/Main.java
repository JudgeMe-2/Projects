package com.laptop;

public class Main {
    public static void main(String[] args) {
        //Example 1
        Laptop lap1 = new LaptopBuilder().Brand("Dell").Ram(8).build();
        System.out.println(lap1);

        //Example 2
        Laptop lap2 = new LaptopBuilder().Brand("Lenovo").Ram(8).Processor("Intel").ScreenSize(15.6).BatteryCapacity(4000).build();
        System.out.println(lap2);

        //Example 3
        Laptop lap3 = new LaptopBuilder().BatteryCapacity(4000).Brand("Acer").build();
        System.out.println(lap3);
    }
}
