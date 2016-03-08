package cl.alcastic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * Created by acastillo on 07-03-16.
 */
public class MilkCarTest {

    MilkCar milkCar;

    @Before
    public void setUp() {
        Location location = new Location(0, 0, Location.NORTH);
        milkCar = new MilkCar(location);
    }

    @Test
    public void canCreateAMilkCar() {
        Location location = new Location(2, 2, Location.NORTH);
        MilkCar milkCar = new MilkCar(location);
        assertNotNull(milkCar);
    }

    @Test
    public void whenCardinalityNorthAndTurnRightThenCardinalityIsEast() {
        milkCar.getLocation().setCardinality(Location.NORTH);
        char expectedCardinality = Location.EAST;
        milkCar.turnRight();
        assertEquals(expectedCardinality, milkCar.getLocation().getCardinality());
    }

    @Test
    public void whenCardinalityEastAndTurnRightThenCardinalityIsSouth() {
        milkCar.getLocation().setCardinality(Location.EAST);
        char expectedCardinality = Location.SOUTH;
        milkCar.turnRight();
        assertEquals(expectedCardinality, milkCar.getLocation().getCardinality());
    }

    @Test
    public void whenCardinalitySouthAndTurnRightThenCardinalityIsWest() {
        milkCar.getLocation().setCardinality(Location.SOUTH);
        char expectedCardinality = Location.WEST;
        milkCar.turnRight();
        assertEquals(expectedCardinality, milkCar.getLocation().getCardinality());
    }

    @Test
    public void whenCardinalityWestAndTurnRightThenCardinalityIsNorth() {
        milkCar.getLocation().setCardinality(Location.WEST);
        char expectedCardinality = Location.NORTH;
        milkCar.turnRight();
        assertEquals(expectedCardinality, milkCar.getLocation().getCardinality());
    }

    @Test
    public void whenCardinalityNorthAndTurnLeftThenCardinalityIsWest() {
        milkCar.getLocation().setCardinality(Location.NORTH);
        char expectedCardinality = Location.WEST;
        milkCar.turnLeft();
        assertEquals(expectedCardinality, milkCar.getLocation().getCardinality());
    }

    @Test
    public void whenCardinalityWestAndTurnLeftThenCardinalityIsSouth() {
        milkCar.getLocation().setCardinality(Location.WEST);
        char expectedCardinality = Location.SOUTH;
        milkCar.turnLeft();
        assertEquals(expectedCardinality, milkCar.getLocation().getCardinality());
    }

    @Test
    public void whenCardinalitySouthAndTurnLeftThenCardinalityIsEast() {
        milkCar.getLocation().setCardinality(Location.SOUTH);
        char expectedCardinality = Location.EAST;
        milkCar.turnLeft();
        assertEquals(expectedCardinality, milkCar.getLocation().getCardinality());
    }
    @Test
    public void whenCardinalityEastAndTurnLeftThenCardinalityIsNorth() {
        milkCar.getLocation().setCardinality(Location.EAST);
        char expectedCardinality = Location.NORTH;
        milkCar.turnLeft();
        assertEquals(expectedCardinality, milkCar.getLocation().getCardinality());
    }

    @Test
    public void whenMoveAndCardinalityIsNorth(){
        milkCar.getLocation().setX(1);
        milkCar.getLocation().setY(1);
        milkCar.getLocation().setCardinality(Location.NORTH);

        int expectedX = 1;
        int expectedY = 2;
        char expectedCardinality = Location.NORTH;

        milkCar.move();

        assertSame(expectedX ,milkCar.getLocation().getX());
        assertSame(expectedY ,milkCar.getLocation().getY());
        assertSame(expectedCardinality ,milkCar.getLocation().getCardinality());

    }

    @Test
    public void whenMoveAndCardinalityIsEast(){
        milkCar.getLocation().setX(1);
        milkCar.getLocation().setY(1);
        milkCar.getLocation().setCardinality(Location.EAST);

        int expectedX = 2;
        int expectedY = 1;
        char expectedCardinality = Location.EAST;

        milkCar.move();

        assertSame(expectedX ,milkCar.getLocation().getX());
        assertSame(expectedY ,milkCar.getLocation().getY());
        assertSame(expectedCardinality ,milkCar.getLocation().getCardinality());

    }

    @Test
    public void whenMoveAndCardinalityIsSouth(){
        milkCar.getLocation().setX(1);
        milkCar.getLocation().setY(1);
        milkCar.getLocation().setCardinality(Location.SOUTH);

        int expectedX = 1;
        int expectedY = 0;
        char expectedCardinality = Location.SOUTH;

        milkCar.move();

        assertSame(expectedX ,milkCar.getLocation().getX());
        assertSame(expectedY ,milkCar.getLocation().getY());
        assertSame(expectedCardinality ,milkCar.getLocation().getCardinality());

    }

    @Test
    public void whenMoveAndCardinalityIsWest(){
        milkCar.getLocation().setX(1);
        milkCar.getLocation().setY(1);
        milkCar.getLocation().setCardinality(Location.WEST);

        int expectedX = 0;
        int expectedY = 1;
        char expectedCardinality = Location.WEST;

        milkCar.move();

        assertSame(expectedX ,milkCar.getLocation().getX());
        assertSame(expectedY ,milkCar.getLocation().getY());
        assertSame(expectedCardinality ,milkCar.getLocation().getCardinality());

    }

}
