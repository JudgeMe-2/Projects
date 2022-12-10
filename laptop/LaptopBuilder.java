package com.laptop;

public class LaptopBuilder {
    private String brand;
    private int ram;
    private String processor;
    private double screenSize;
    private int batteryCapacity;

    public LaptopBuilder Brand(String brand) {
        this.brand = brand;
        return this;
    }

    public LaptopBuilder Ram(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder Processor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder ScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public LaptopBuilder BatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    /*public Laptop build() {

        //Laptop laptop = new Laptop(this);
        return new Laptop(this);
    }*/

    public Laptop build() {
        return new Laptop(brand, ram, processor, screenSize, batteryCapacity);
    }
}
