import org.junit.Before;
import org.junit.Test;
import vehicles.QuadBike;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {
    QuadBike quadBike;

    @Before
    public void before() {
        quadBike = new QuadBike(30, 800);
    }

    @Test
    public void canGetEngineCapacity() {
        assertEquals(800, quadBike.getEngineCapacityCC());
    }

    @Test
    public void canGetAverageSpeed() {
        assertEquals(30, quadBike.getAverageSpeed());
    }

    @Test
    public void canGetTimeOfJourney() {
        assertEquals(1, quadBike.timeToDriveDistance(45));
    }

}
