package com.laptop2;

public interface LaptopBuilder {
    public void buildLaptopBrand();
    public void buildLaptopRam();
    public void buildLaptopProcessor();
    public void buildLaptopScreenSize();
    public void buildLaptopBatteryCapacity();

    public Laptop getLaptop();
}
