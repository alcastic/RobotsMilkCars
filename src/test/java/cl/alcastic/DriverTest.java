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
        Location location = new Location(0, 0, Location.NORTH);
        MilkCar milkCar = new MilkCar(location);
        Driver driver = new Driver(milkCar, region);
        assertNotNull(driver);
    }

    @Test
    public void whenDrivingWithCorrectDataTestCaseOne() {
        Location location = new Location(1, 2, Location.NORTH);
        MilkCar milkCar = new MilkCar(location);
        Driver driver = new Driver(milkCar, region);
        String instruction = "IMIMIMIMM";
        String expectedOutPut = "1 3 N";
        assertEquals(expectedOutPut, driver.drive(instruction));
    }

    @Test
    public void whenDrivingWithCorrectDataTestCaseTwo() {
        Location location = new Location(3, 3, Location.EAST);
        MilkCar milkCar = new MilkCar(location);
        Driver driver = new Driver(milkCar, region);
        String instruction = "MMDMMDMDDM";
        String expectedOutPut = "5 1 E";
        assertEquals(expectedOutPut, driver.drive(instruction));
    }

    @Test(expected = Driver.CommandNotFoundException.class)
    public void whenAnInstructionIsInvalid(){
        Location location = new Location(x, 5, Location.NORTH);
        MilkCar milkCar = new MilkCar(location);
        Driver driver = new Driver(milkCar, region);
        String instruction = "IR";
        driver.drive(instruction);
    }

    @Test(expected = Driver.CrashException.class)
    public void whenCrashByTheNorth() {
        Location location = new Location(x, 5, Location.NORTH); // x value can be 0,1,2,3,4,5
        MilkCar milkCar = new MilkCar(location);
        Driver driver = new Driver(milkCar, region);
        String instruction = "M";
        driver.drive(instruction);
    }

    @Test(expected = Driver.CrashException.class)
    public void whenCrashByTheEAST() {
        Location location = new Location(5, y, Location.EAST); // y value can be 0,1,2,3,4,5
        MilkCar milkCar = new MilkCar(location);
        Driver driver = new Driver(milkCar, region);
        String instruction = "M";
        driver.drive(instruction);
    }

    @Test(expected = Driver.CrashException.class)
    public void whenCrashByTheSouth() {
        Location location = new Location(x, 0, Location.SOUTH); // x value can be 0,1,2,3,4,5
        MilkCar milkCar = new MilkCar(location);
        Driver driver = new Driver(milkCar, region);
        String instruction = "M";
        driver.drive(instruction);
    }

    @Test(expected = Driver.CrashException.class)
    public void whenCrashByTheWest() {
        Location location = new Location(0, y, Location.WEST); // y value can be 0,1,2,3,4,5
        MilkCar milkCar = new MilkCar(location);
        Driver driver = new Driver(milkCar, region);
        String instruction = "M";
        driver.drive(instruction);
    }
}
