package edu.technischools.java;

// Klasa SportCar dziedzicząca po Car
public class SportCar extends Car {
    // Konstruktor z wszystkimi parametrami
    public SportCar(String name, double weight, double speed, byte noOfDoors) {
        super(name, weight, speed, noOfDoors);
    }

    // SportCar może dziedziczyć metodę move() z Car, nie jest wymagane jej nadpisywanie
}
