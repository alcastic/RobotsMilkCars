package cl.alcastic;

/**
 * Created by acastillo on 07-03-16.
 */
public interface Horientable {
    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final char EAST = 'E';
    public static final char WEST = 'W';

    public char getCardinality();
}
