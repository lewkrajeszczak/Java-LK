package edu.technischools.java;

// Klasa bazowa Vehicle (abstrakcyjna)
public abstract class Vehicle implements Comparable<Vehicle> {
    private String name;
    private double weight;
    private double speed;

    // Konstruktor z wszystkimi parametrami
    public Vehicle(String name, double weight, double speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }
    @Override
    public int compareTo(Vehicle other) {
        return Double.compare(this.getSpeed(), other.getSpeed());
    }
    // Abstrakcyjna metoda move
    public abstract void move();

    // Getery i setery dla pól klasy Vehicle
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public abstract void fly();
}

