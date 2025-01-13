package com.Practice.Practice_New;



// Product class
class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " (" + color + ")";
    }
}

// Builder Interface
interface CarBuilder {
    void setMake(String make);
    void setModel(String model);
    void setYear(int year);
    void setColor(String color);
    Car build();
}

// Concrete Builder
class SportsCarBuilder implements CarBuilder {
    private Car car;

    public SportsCarBuilder() {
        car = new Car();
    }

    @Override
    public void setMake(String make) {
        car.setMake(make);
    }

    @Override
    public void setModel(String model) {
        car.setModel(model);
    }

    @Override
    public void setYear(int year) {
        car.setYear(year);
    }

    @Override
    public void setColor(String color) {
        car.setColor(color);
    }

    @Override
    public Car build() {
        return car;
    }
}

// Director
class CarDirector {
    public void constructSportsCar(CarBuilder builder) {
        builder.setMake("Toyota");
        builder.setModel("Supra");
        builder.setYear(2022);
        builder.setColor("Red");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new SportsCarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.build();
        System.out.println(car);
    }
}

