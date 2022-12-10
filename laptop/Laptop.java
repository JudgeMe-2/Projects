package com.laptop;

public class Laptop {
    private String brand;
    private int ram;
    private String processor;
    private double screenSize;
    private int batteryCapacity;

    public Laptop(String brand, int ram, String processor, double screenSize, int batteryCapacity) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

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
