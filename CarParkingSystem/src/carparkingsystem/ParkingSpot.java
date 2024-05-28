package carparkingsystem;

/**
 * Represents a parking spot that can be occupied by a car.
 */
public class ParkingSpot {
    private final int spotNumber;
    private Car car;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.car = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Car getCar() {
        return car;
    }

    public boolean isAvailable() {
        return car == null;
    }

    public void parkCar(Car car) {
        if (isAvailable()) {
            this.car = car;
        } else {
            System.out.println("Spot " + spotNumber + " is already occupied.");
        }
    }

    public void removeCar() {
        if (!isAvailable()) {
            this.car = null;
        } else {
            System.out.println("Spot " + spotNumber + " is already empty.");
        }
    }

    @Override
    public String toString() {
        if (isAvailable()) {
            return "ParkingSpot [spotNumber=" + spotNumber + ", Status=Available]";
        } else {
            return "ParkingSpot [spotNumber=" + spotNumber + ", car=" + car + "]";
        }
    }
}
