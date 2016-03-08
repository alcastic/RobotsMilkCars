package cl.alcastic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * Created by acastillo on 07-03-16.
 */
public class LocationTest {
    private Location location;

    @Before
    public void setUp() {
        int x = 0;
        int y = 0;
        char cardinality = Location.NORTH;
        location = new Location(x, y, cardinality);
    }

    @Test
    public void canCreateAPosition() {
        Location location = new Location(0, 0, 'N');
        assertNotNull(location);
    }

    @Test
    public void canChangePositionCardinality(){
        char expectedCardinality = Location.SOUTH;
        location.setCardinality(expectedCardinality);
        assertSame(expectedCardinality, location.getCardinality());
    }

    @Test
    public void whenToStringMethodIsCalled(){
        String expectedString = "0 0 N";
        assertEquals(expectedString, location.toString());
    }
}
