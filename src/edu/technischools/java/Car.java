package edu.technischools.java;

// Klasa Car dziedzicząca po Vehicle
public class Car extends Vehicle {
    private byte noOfDoors;

    // Konstruktor z wszystkimi parametrami
    public Car(String name, double weight, double speed, byte noOfDoors) {
        super(name, weight, speed);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void fly() {

    }

    // Getery i setery dla pola noOfDoors
    public byte getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(byte noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
}
