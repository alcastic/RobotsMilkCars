package cl.alcastic;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by acastillo on 07-03-16.
 */
@Getter
@Setter
public class Location {
    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final char EAST = 'E';
    public static final char WEST = 'W';
    private int x;
    private int y;
    private char cardinality;

    public Location(int x, int y, char cardinality) {
        this.x = x;
        this.y = y;
        this.cardinality = cardinality;
    }

    public String toString() {
        return this.x + " " + this.y + " " + this.cardinality;
    }
}
