package cl.alcastic;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by acastillo on 07-03-16.
 */
@Getter
@Setter
public class Position implements Horientable {
    private int x;
    private int y;
    private char cardinality;

    public Position(int x, int y, char cardinality) {
        this.x = x;
        this.y = y;
        this.cardinality = cardinality;
    }

    public String toString() {
        return this.x + " " + this.y + " " + this.cardinality;
    }
}
