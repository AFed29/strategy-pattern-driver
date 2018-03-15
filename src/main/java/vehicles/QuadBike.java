package vehicles;

import behaviours.IDrivable;

public class QuadBike extends Vehicle implements IDrivable {
    private int engineCapacityCC;

    public QuadBike(int averageSpeed, int engineCapacityCC) {
        super(averageSpeed);
        this.engineCapacityCC = engineCapacityCC;
    }

    public int getEngineCapacityCC() {
        return engineCapacityCC;
    }

    public int timeToDriveDistance(int distance) {
        return (distance / getAverageSpeed());
    }
}
