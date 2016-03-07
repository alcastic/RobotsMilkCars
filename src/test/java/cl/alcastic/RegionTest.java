package cl.alcastic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by acastillo on 07-03-16.
 */
public class RegionTest {
    Region region;

    @Before
    public void setUp() {
        region = new Region(5, 5);
    }

    @Test
    public void canCreateARegion() {
        assertNotNull(region);
    }

    @Test
    public void canAskIfACoordenateIsInsideOfRegion() {
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                assertTrue(region.isInside(x, y));
            }
        }
    }

    @Test
    public void canAskIfACoordenateIsNotInsideOfRegion() {
        int x = 6;
        int y = 6;
        assertTrue(!region.isInside(x, y));
    }
}
