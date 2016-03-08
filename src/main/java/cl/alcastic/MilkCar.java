package cl.alcastic;

import lombok.Getter;

/**
 * Created by acastillo on 07-03-16.
 */
@Getter
public class MilkCar {
    private Location location;

    public MilkCar(Location location) {
        this.location = location;
    }

    public void turnRight() {
        switch (this.location.getCardinality()) {
            case Location.NORTH:
                location.setCardinality(Location.EAST);
                break;
            case Location.EAST:
                location.setCardinality(Location.SOUTH);
                break;
            case Location.SOUTH:
                location.setCardinality(Location.WEST);
                break;
            case Location.WEST:
                location.setCardinality(Location.NORTH);
                break;
        }

    }

    public void turnLeft() {
        switch (this.location.getCardinality()) {
            case Location.NORTH:
                location.setCardinality(Location.WEST);
                break;
            case Location.WEST:
                location.setCardinality(Location.SOUTH);
                break;
            case Location.SOUTH:
                location.setCardinality(Location.EAST);
                break;
            case Location.EAST:
                location.setCardinality(Location.NORTH);
                break;
        }
    }

    public void move() {
        switch (this.location.getCardinality()) {
            case Location.NORTH:
                this.getLocation().setY(this.location.getY() + 1);
                break;
            case Location.EAST:
                this.getLocation().setX(this.location.getX() + 1);
                break;
            case Location.SOUTH:
                this.getLocation().setY(this.location.getY() - 1);
                break;
            case Location.WEST:
                this.getLocation().setX(this.location.getX() - 1);
                break;
        }

    }
}
