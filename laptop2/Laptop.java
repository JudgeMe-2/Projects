package com.laptop2;

public class Laptop implements LaptopParts {
    private String laptopBrand;
    private int laptopRam;
    private String laptopProcessor;
    private double laptopScreenSize;
    private int laptopBatteryCapacity;


    @Override
    public void setLaptopBrand(String brand) {
        laptopBrand = brand;
    }

    @Override
    public void setLaptopRam(int ram) {
        laptopRam = ram;
    }

    @Override
    public void setLaptopProcessor(String processor) {
        laptopProcessor = processor;
    }

    @Override
    public void setLaptopScreenSize(double screenSize) {
        laptopScreenSize = screenSize;
    }

    @Override
    public void setLaptopBatteryCapacity(int batteryCapacity) {
        laptopBatteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "{" +
                "laptopBrand='" + laptopBrand + '\'' +
                ", laptopRam=" + laptopRam +
                ", laptopProcessor='" + laptopProcessor + '\'' +
                ", laptopScreenSize=" + laptopScreenSize +
                ", laptopBatteryCapacity=" + laptopBatteryCapacity +
                '}';
    }
}
