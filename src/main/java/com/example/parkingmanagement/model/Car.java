package com.example.parkingmanagement.model;

import com.example.parkingmanagement.Parkable;

import java.util.Objects;

public class Car implements Parkable {
    private final String licensePlate;
    private final String brand;

    public Car(String licensePlate, String brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }
}
