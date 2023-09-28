package edu.technischools.java;

// Klasa JetFighter dziedzicząca po Plane
public class JetFighter extends Plane {
    // Konstruktor z wszystkimi parametrami
    public JetFighter(String name, double weight, double speed, double maxAltitude) {
        super(name, weight, speed, maxAltitude);
    }

    // JetFighter może dziedziczyć metodę move() z Plane, nie jest wymagane jej nadpisywanie
}
