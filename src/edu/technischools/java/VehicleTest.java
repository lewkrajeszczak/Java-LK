package edu.technischools.java;
import java.util.Arrays;

public class VehicleTest {
    public static void main(String[] args) {
        // Stworzenie tablicy 4 elementowej typu Vehicle
        Vehicle[] vehicles = new Vehicle[4];

        // Stworzenie obiektów różnych typów i dodanie ich do tablicy
        vehicles[0] = new Car("Car 1", 1500.0, 120.0, (byte) 4);
        vehicles[1] = new SportCar("SportCar 1", 1300.0, 200.0, (byte) 2);
        vehicles[2] = new Plane("Plane 1", 8000.0, 500.0, 35000.0);
        vehicles[3] = new JetFighter("JetFighter 1", 6000.0, 1200.0, 60000.0);

        // Stworzenie tablicy 2 elementowej typu Flyable
        Flyable[] flyableVehicles = new Flyable[2];

        // Iteracja po tablicy vehicles
        for (Vehicle vehicle : vehicles) {
            // Sprawdzenie, czy dany element jest typu Flyable
            if (vehicle instanceof Flyable) {
                // Jeśli tak, to dodaj go do tablicy flyableVehicles
                flyableVehicles[0] = (Flyable) vehicle;
            }
        }

        // Wywołanie metody fly() na każdym elemencie tablicy flyableVehicles
        for (Flyable flyable : flyableVehicles) {
            if (flyable != null) {
                flyable.fly();
            }
        }
        // Sortowanie tablicy vehicles na podstawie prędkości
        Arrays.sort(vehicles);

        // Wypisanie posortowanej tablicy na konsolę
        System.out.println(Arrays.toString(vehicles));
    }
}
