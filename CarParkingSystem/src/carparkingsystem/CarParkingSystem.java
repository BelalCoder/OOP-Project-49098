package carparkingsystem;

/**
 * Main class for the Car Parking System.
 */
public class CarParkingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5);

        Car car1 = new Car("ABC123", "Toyota");
        Car car2 = new Car("XYZ789", "Honda");

        parkingLot.parkCar(1, car1);
        parkingLot.parkCar(2, car2);
        parkingLot.parkCar(1, new Car("LMN456", "Ford"));

        parkingLot.displayStatus();

        parkingLot.removeCar(1);
        parkingLot.removeCar(3);

        parkingLot.displayStatus();
        
        System.out.println("PROJECT MADE BY RAJA M BILAL, 49098");
    }
}
