package com.car;

public class ToyotaCarBuilder implements CarBuilder{

    private Car car;
    public ToyotaCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildCarName() {
        car.setCarName("Toyota");
    }

    @Override
    public void buildCarWheels() {
        car.setCarWheels(4);
    }

    @Override
    public void buildCarColor() {
        car.setCarColor("Black");
    }

    @Override
    public void buildCarSize() {
        car.setCarSize(190.1);
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
