package carparkingsystem;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a collection of parking spots.
 */
public class ParkingLot {
    private final Map<Integer, ParkingSpot> spots;

    public ParkingLot(int numberOfSpots) {
        spots = new HashMap<>();
        for (int i = 1; i <= numberOfSpots; i++) {
            spots.put(i, new ParkingSpot(i));
        }
    }

    public void parkCar(int spotNumber, Car car) {
        ParkingSpot spot = spots.get(spotNumber);
        if (spot != null) {
            spot.parkCar(car);
        } else {
            System.out.println("Spot " + spotNumber + " does not exist.");
        }
    }

    public void removeCar(int spotNumber) {
        ParkingSpot spot = spots.get(spotNumber);
        if (spot != null) {
            spot.removeCar();
        } else {
            System.out.println("Spot " + spotNumber + " does not exist.");
        }
    }

    public void displayStatus() {
        spots.values().stream().forEach((spot) -> {
            System.out.println(spot);
        });
    }
}
