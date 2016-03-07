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
        Position position = new Position(0, 0, Position.NORTH);
        milkCar = new MilkCar(position);
    }

    @Test
    public void canCreateAMilkCar() {
        Position position = new Position(2, 2, Position.NORTH);
        MilkCar milkCar = new MilkCar(position);
        assertNotNull(milkCar);
    }

    @Test
    public void whenCardinalityNorthAndTurnRightThenCardinalityIsEast() {
        milkCar.getPosition().setCardinality(Position.NORTH);
        char expectedCardinality = Position.EAST;
        milkCar.turnRight();
        assertEquals(expectedCardinality, milkCar.getPosition().getCardinality());
    }

    @Test
    public void whenCardinalityEastAndTurnRightThenCardinalityIsSouth() {
        milkCar.getPosition().setCardinality(Position.EAST);
        char expectedCardinality = Position.SOUTH;
        milkCar.turnRight();
        assertEquals(expectedCardinality, milkCar.getPosition().getCardinality());
    }

    @Test
    public void whenCardinalitySouthAndTurnRightThenCardinalityIsWest() {
        milkCar.getPosition().setCardinality(Position.SOUTH);
        char expectedCardinality = Position.WEST;
        milkCar.turnRight();
        assertEquals(expectedCardinality, milkCar.getPosition().getCardinality());
    }

    @Test
    public void whenCardinalityWestAndTurnRightThenCardinalityIsNorth() {
        milkCar.getPosition().setCardinality(Position.WEST);
        char expectedCardinality = Position.NORTH;
        milkCar.turnRight();
        assertEquals(expectedCardinality, milkCar.getPosition().getCardinality());
    }

    @Test
    public void whenCardinalityNorthAndTurnLeftThenCardinalityIsWest() {
        milkCar.getPosition().setCardinality(Position.NORTH);
        char expectedCardinality = Position.WEST;
        milkCar.turnLeft();
        assertEquals(expectedCardinality, milkCar.getPosition().getCardinality());
    }

    @Test
    public void whenCardinalityWestAndTurnLeftThenCardinalityIsSouth() {
        milkCar.getPosition().setCardinality(Position.WEST);
        char expectedCardinality = Position.SOUTH;
        milkCar.turnLeft();
        assertEquals(expectedCardinality, milkCar.getPosition().getCardinality());
    }

    @Test
    public void whenCardinalitySouthAndTurnLeftThenCardinalityIsEast() {
        milkCar.getPosition().setCardinality(Position.SOUTH);
        char expectedCardinality = Position.EAST;
        milkCar.turnLeft();
        assertEquals(expectedCardinality, milkCar.getPosition().getCardinality());
    }
    @Test
    public void whenCardinalityEastAndTurnLeftThenCardinalityIsNorth() {
        milkCar.getPosition().setCardinality(Position.EAST);
        char expectedCardinality = Position.NORTH;
        milkCar.turnLeft();
        assertEquals(expectedCardinality, milkCar.getPosition().getCardinality());
    }

    @Test
    public void whenMoveAndCardinalityIsNorth(){
        milkCar.getPosition().setX(1);
        milkCar.getPosition().setY(1);
        milkCar.getPosition().setCardinality(Position.NORTH);

        int expectedX = 1;
        int expectedY = 2;
        char expectedCardinality =Position.NORTH;

        milkCar.move();

        assertSame(expectedX ,milkCar.getPosition().getX());
        assertSame(expectedY ,milkCar.getPosition().getY());
        assertSame(expectedCardinality ,milkCar.getPosition().getCardinality());

    }

    @Test
    public void whenMoveAndCardinalityIsEast(){
        milkCar.getPosition().setX(1);
        milkCar.getPosition().setY(1);
        milkCar.getPosition().setCardinality(Position.EAST);

        int expectedX = 2;
        int expectedY = 1;
        char expectedCardinality =Position.EAST;

        milkCar.move();

        assertSame(expectedX ,milkCar.getPosition().getX());
        assertSame(expectedY ,milkCar.getPosition().getY());
        assertSame(expectedCardinality ,milkCar.getPosition().getCardinality());

    }

    @Test
    public void whenMoveAndCardinalityIsSouth(){
        milkCar.getPosition().setX(1);
        milkCar.getPosition().setY(1);
        milkCar.getPosition().setCardinality(Position.SOUTH);

        int expectedX = 1;
        int expectedY = 0;
        char expectedCardinality =Position.SOUTH;

        milkCar.move();

        assertSame(expectedX ,milkCar.getPosition().getX());
        assertSame(expectedY ,milkCar.getPosition().getY());
        assertSame(expectedCardinality ,milkCar.getPosition().getCardinality());

    }

    @Test
    public void whenMoveAndCardinalityIsWest(){
        milkCar.getPosition().setX(1);
        milkCar.getPosition().setY(1);
        milkCar.getPosition().setCardinality(Position.WEST);

        int expectedX = 0;
        int expectedY = 1;
        char expectedCardinality =Position.WEST;

        milkCar.move();

        assertSame(expectedX ,milkCar.getPosition().getX());
        assertSame(expectedY ,milkCar.getPosition().getY());
        assertSame(expectedCardinality ,milkCar.getPosition().getCardinality());

    }

}
