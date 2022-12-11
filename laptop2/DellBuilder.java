package com.laptop2;

public class DellBuilder implements LaptopBuilder {

    private Laptop lap;

    public DellBuilder() {
        this.lap = new Laptop();
    }

    @Override
    public void buildLaptopBrand() {
        lap.setLaptopBrand("Dell");
    }

    @Override
    public void buildLaptopRam() {
        lap.setLaptopRam(4);
    }

    @Override
    public void buildLaptopProcessor() {
        lap.setLaptopProcessor("AMD");
    }

    @Override
    public void buildLaptopScreenSize() {
        lap.setLaptopScreenSize(15.6);
    }

    @Override
    public void buildLaptopBatteryCapacity() {
        lap.setLaptopBatteryCapacity(4000);
    }

    @Override
    public Laptop getLaptop() {
        return this.lap;
    }
}
