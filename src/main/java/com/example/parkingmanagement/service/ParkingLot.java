package com.example.parkingmanagement.service;

import com.example.parkingmanagement.Parkable;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int capacity;
    private List<Parkable> parked;


    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parked = new ArrayList<>();
    }

    public boolean parkCar(Parkable parkable){

        if(!isParked(parkable) && parked.size() < capacity){
            parked.add(parkable);
            return true;
        }
        else
            return false;

    }

    public boolean isParked(Parkable parkable) {
        return parked.contains(parkable);
    }

}
