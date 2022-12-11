package com.laptop2;


public class ComputerEngineer {
    private LaptopBuilder laptopBuilder;

    public ComputerEngineer(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop getLaptop() {
        return this.laptopBuilder.getLaptop();
    }

    public void createLaptop() {
        this.laptopBuilder.buildLaptopBrand();
        this.laptopBuilder.buildLaptopRam();
        this.laptopBuilder.buildLaptopProcessor();
        this.laptopBuilder.buildLaptopScreenSize();
        this.laptopBuilder.buildLaptopBatteryCapacity();
    }
}
