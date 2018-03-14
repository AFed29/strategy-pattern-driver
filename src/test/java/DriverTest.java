import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {
    Driver driver;
    QuadBike quadBike;

    @Before
    public void before() {
        quadBike = new QuadBike(50, 1500);
        driver = new Driver("Stig", quadBike);
    }

    @Test
    public void canDriveDistance() {
        assertEquals(1, driver.timeToDriveDistance(50));
    }

    @Test
    public void canGetName() {
        assertEquals("Stig", driver.getName());
    }

    @Test
    public void canSetRide() {
        DodgemCar dodgemCar = new DodgemCar();
        driver.setRide(dodgemCar);
        assertEquals(2, driver.timeToDriveDistance(30));
    }
}
