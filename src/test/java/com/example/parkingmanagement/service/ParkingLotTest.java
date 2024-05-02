package com.example.parkingmanagement.service;

import com.example.parkingmanagement.model.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void carParkedSuccessfully() {
        ParkingLot parkingLot = new ParkingLot(4);

        Car car1 = new Car("ABC123", "Toyota");
        Car car2 = new Car("XYZ789", "Honda");
        Car car3 = new Car("DEF456", "Ford");
        Car car4 = new Car("QRT456", "Bugati");

        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        parkingLot.parkCar(car3);

        assertTrue(parkingLot.parkCar(car4));
    }

    @Test
    void carIsNotParked() {
        ParkingLot parkingLot = new ParkingLot(2);

        Car car1 = new Car("ABC123", "Toyota");
        Car car2 = new Car("XYZ789", "Honda");
        Car car3 = new Car("DEF456", "Ford");
        Car car4 = new Car("QRT456", "Bugati");

        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);


        assertFalse(parkingLot.parkCar(car4));
    }

    @Test
    void sameCarNotParkedAgain(){

        ParkingLot parkingLot = new ParkingLot(4);

        Car car1 = new Car("ABC123", "Toyota");
        Car car2 = new Car("XYZ789", "Honda");

        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);

        assertFalse(parkingLot.parkCar(car2));


    }

    @Test
    void carIsParkedInParkingLot(){

        ParkingLot parkingLot = new ParkingLot(4);

        Car car1 = new Car("ABC123", "Toyota");
        Car car2 = new Car("XYZ789", "Honda");
        Car car3 = new Car("DEF456", "Ford");
        Car car4 = new Car("QRT456", "Bugati");

        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        parkingLot.parkCar(car3);

        assertTrue(parkingLot.isParked(car1));

    }



    @Test
    void carIsNotParkedInParkingLot(){
        ParkingLot parkingLot = new ParkingLot(2);

        Car car1 = new Car("ABC123", "Toyota");
        Car car2 = new Car("XYZ789", "Honda");
        Car car4 = new Car("QRT456", "Bugati");

        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);

        assertFalse(parkingLot.isParked(car4));
    }

}