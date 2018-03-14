public class QuadBike extends Vehicle {
    private int engineCapacityCC;

    public QuadBike(int averageSpeed, int engineCapacityCC) {
        super(averageSpeed);
        this.engineCapacityCC = engineCapacityCC;
    }

    public int getEngineCapacityCC() {
        return engineCapacityCC;
    }
}
