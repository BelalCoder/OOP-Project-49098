package carparkingsystem;

/**
 * Represents a car with a license plate and model.
 */
public class Car {
    private final String licensePlate;
    private final String model;

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car [licensePlate=" + licensePlate + ", model=" + model + "]";
    }
}
