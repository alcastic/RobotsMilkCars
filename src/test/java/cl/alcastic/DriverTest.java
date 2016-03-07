package cl.alcastic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by acastillo on 07-03-16.
 */
public class DriverTest {
    private int x = 5;
    private int y = 5;
    private Region region;

    @Before
    public void setUp() {
        region = new Region(x, y);
    }

    @Test
    public void canCreateADriver() {
        Position position = new Position(0, 0, Position.NORTH);
        MilkCar milkCar = new MilkCar(position);
        Driver driver = new Driver(milkCar, region);
        assertNotNull(driver);
    }

    @Test
    public void whenDrivingWithCorrectDataTestCaseOne() {
        Position position = new Position(1, 2, Position.NORTH);
        MilkCar milkCar = new MilkCar(position);
        Driver driver = new Driver(milkCar, region);
        String instruction = "IMIMIMIMM";
        String expectedOutPut = "1 3 N";
        assertEquals(expectedOutPut, driver.drive(instruction));
    }

    @Test
    public void whenDrivingWithCorrectDataTestCaseTwo() {
        Position position = new Position(3, 3, Position.EAST);
        MilkCar milkCar = new MilkCar(position);
        Driver driver = new Driver(milkCar, region);
        String instruction = "MMDMMDMDDM";
        String expectedOutPut = "5 1 E";
        assertEquals(expectedOutPut, driver.drive(instruction));
    }

    @Test(expected = Driver.CommandNotFoundException.class)
    public void whenAnInstructionIsInvalid(){
        Position position = new Position(x, 5, Position.NORTH);
        MilkCar milkCar = new MilkCar(position);
        Driver driver = new Driver(milkCar, region);
        String instruction = "IR";
        driver.drive(instruction);
    }

    @Test(expected = Driver.CrashException.class)
    public void whenCrashByTheNorth() {
        Position position = new Position(x, 5, Position.NORTH); // x value can be 0,1,2,3,4,5
        MilkCar milkCar = new MilkCar(position);
        Driver driver = new Driver(milkCar, region);
        String instruction = "M";
        driver.drive(instruction);
    }

    @Test(expected = Driver.CrashException.class)
    public void whenCrashByTheEAST() {
        Position position = new Position(5, y, Position.EAST); // y value can be 0,1,2,3,4,5
        MilkCar milkCar = new MilkCar(position);
        Driver driver = new Driver(milkCar, region);
        String instruction = "M";
        driver.drive(instruction);
    }

    @Test(expected = Driver.CrashException.class)
    public void whenCrashByTheSouth() {
        Position position = new Position(x, 0, Position.SOUTH); // x value can be 0,1,2,3,4,5
        MilkCar milkCar = new MilkCar(position);
        Driver driver = new Driver(milkCar, region);
        String instruction = "M";
        driver.drive(instruction);
    }

    @Test(expected = Driver.CrashException.class)
    public void whenCrashByTheWest() {
        Position position = new Position(0, y, Position.WEST); // y value can be 0,1,2,3,4,5
        MilkCar milkCar = new MilkCar(position);
        Driver driver = new Driver(milkCar, region);
        String instruction = "M";
        driver.drive(instruction);
    }
}
