public class DodgemCar extends Vehicle {
    private int numberOfSeats;

    public DodgemCar() {
        super(15);
        numberOfSeats = 2;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
