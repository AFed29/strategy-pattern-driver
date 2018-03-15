import behaviours.IDrivable;

public class Driver {
    private String name;
    private IDrivable vehicle;

    public Driver(String name, IDrivable vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public int timeToDriveDistance(int distance) {
        return vehicle.timeToDriveDistance(distance);
    }

    public String getName() {
        return name;
    }

    public void setRide(IDrivable ride) {
        this.vehicle = ride;
    }
}
