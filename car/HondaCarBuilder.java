package com.car;

public class HondaCarBuilder implements CarBuilder {
    private Car car;

    public HondaCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildCarName() {
        car.setCarName("Honda");
    }

    @Override
    public void buildCarWheels() {
        car.setCarWheels(4);
    }

    @Override
    public void buildCarColor() {
        car.setCarColor("Red");
    }

    @Override
    public void buildCarSize() {
        car.setCarSize(180);
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
