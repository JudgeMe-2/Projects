package com.car;

public interface CarBuilder {
    public void buildCarName();
    public void buildCarWheels();
    public void buildCarColor();
    public void buildCarSize();

    public Car getCar();
}
