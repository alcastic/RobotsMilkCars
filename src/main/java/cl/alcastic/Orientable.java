package cl.alcastic;

/**
 * Created by acastillo on 07-03-16.
 */
public interface Orientable {
    char NORTH = 'N';
    char SOUTH = 'S';
    char EAST = 'E';
    char WEST = 'W';

    char getCardinality();
}
