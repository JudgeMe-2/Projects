package com.car;

public class Car implements CarPlan {
    private String carName;
    private int carWheels;
    private String carColor;
    private double carSize;

    @Override
    public void setCarName(String name) {
        carName = name;
    }

    @Override
    public void setCarWheels(int wheels) {
        carWheels = wheels;
    }

    @Override
    public void setCarColor(String color) {
        carColor = color;
    }

    @Override
    public void setCarSize(double size) {
        carSize = size;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carWheels=" + carWheels +
                ", carColor='" + carColor + '\'' +
                ", carSize=" + carSize +
                '}';
    }
}
