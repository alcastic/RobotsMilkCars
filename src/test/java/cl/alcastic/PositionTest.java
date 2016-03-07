package cl.alcastic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * Created by acastillo on 07-03-16.
 */
public class PositionTest {
    private Position position;

    @Before
    public void setUp() {
        int x = 0;
        int y = 0;
        char cardinality = Position.NORTH;
        position = new Position(x, y, cardinality);
    }

    @Test
    public void canCreateAPosition() {
        Position position = new Position(0, 0, 'N');
        assertNotNull(position);
    }

    @Test
    public void canChangePositionCardinality(){
        char expectedCardinality = Position.SOUTH;
        position.setCardinality(expectedCardinality);
        assertSame(expectedCardinality, position.getCardinality());
    }

    @Test
    public void whenToStringMethodIsCalled(){
        String expectedString = "0 0 N";
        assertEquals(expectedString, position.toString());
    }
}
