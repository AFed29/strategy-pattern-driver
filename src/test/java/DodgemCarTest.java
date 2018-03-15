import org.junit.Before;
import org.junit.Test;
import vehicles.DodgemCar;

import static org.junit.Assert.assertEquals;

public class DodgemCarTest {
    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar();
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, dodgemCar.getNumberOfSeats());
    }

    @Test
    public void canGetAverageSpeed() {
        assertEquals(15, dodgemCar.getAverageSpeed());
    }

    @Test
    public void canGetTimeOfJourney() {
        assertEquals(2, dodgemCar.timeToDriveDistance(30));
    }
}
