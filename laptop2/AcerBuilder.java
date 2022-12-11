package com.laptop2;

public class AcerBuilder implements LaptopBuilder{
    private Laptop lap;

    public AcerBuilder() {
        this.lap = new Laptop();
    }

    @Override
    public void buildLaptopBrand() {
        lap.setLaptopBrand("Acer");
    }

    @Override
    public void buildLaptopRam() {
        lap.setLaptopRam(8);
    }

    @Override
    public void buildLaptopProcessor() {
        lap.setLaptopProcessor("Intel");
    }

    @Override
    public void buildLaptopScreenSize() {
        lap.setLaptopScreenSize(15.6);
    }

    @Override
    public void buildLaptopBatteryCapacity() {
        lap.setLaptopBatteryCapacity(3600);
    }

    @Override
    public Laptop getLaptop() {
        return this.lap;
    }
}
