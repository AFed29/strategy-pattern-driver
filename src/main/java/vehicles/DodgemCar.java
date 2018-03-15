package vehicles;

import behaviours.IDrivable;

public class DodgemCar extends Vehicle implements IDrivable {
    private int numberOfSeats;

    public DodgemCar() {
        super(15);
        numberOfSeats = 2;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int timeToDriveDistance(int distance) {
        return (distance / getAverageSpeed());
    }
}
