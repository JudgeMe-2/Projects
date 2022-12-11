package com.car;

public class Engineer {
    private CarBuilder carBuilder;

    public Engineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    public Car getCar() {
        return this.carBuilder.getCar();
    }

    public void assembleCar() {
        this.carBuilder.buildCarName();
        this.carBuilder.buildCarWheels();
        this.carBuilder.buildCarColor();
        this.carBuilder.buildCarSize();
    }
}
