public class Driver {
    private String name;
    private IDrivable ride;

    public Driver(String name, IDrivable ride) {
        this.name = name;
        this.ride = ride;
    }

    public int timeToDriveDistance(int distance) {
        return ride.timeToDriveDistance(distance);
    }

    public String getName() {
        return name;
    }

    public void setRide(IDrivable ride) {
        this.ride = ride;
    }
}
