package com.laptop;

public class Laptop {
    private final String brand;
    private final int ram;
    private final String processor;
    private final double screenSize;
    private final int batteryCapacity;

    Laptop(String brand, int ram, String processor, double screenSize, int batteryCapacity) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    /*Laptop(LaptopBuilder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
        this.batteryCapacity = builder.batteryCapacity;
    }*/
    
    @Override
    public String toString() {
        return "Laptop{" +
                "Brand='" + brand + '\'' +
                ", ram=" + ram +
                ", Processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
