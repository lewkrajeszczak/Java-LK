package edu.technischools.java;

// Klasa Plane dziedzicząca po Vehicle i implementująca interfejs Flyable
public class Plane extends Vehicle implements Flyable {
    private double maxAltitude;

    // Konstruktor z wszystkimi parametrami
    public Plane(String name, double weight, double speed, double maxAltitude) {
        super(name, weight, speed);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void move() {
        System.out.println("Plane is flying.");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying.");
    }

    @Override
    public double getMaxAltitude() {
        return maxAltitude;
    }
}
