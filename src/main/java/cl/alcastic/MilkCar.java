package cl.alcastic;

import lombok.Getter;

/**
 * Created by acastillo on 07-03-16.
 */
@Getter
public class MilkCar {
    private Position position;

    public MilkCar(Position position) {
        this.position = position;
    }

    public void turnRight() {
        switch (this.position.getCardinality()) {
            case Position.NORTH:
                position.setCardinality(Position.EAST);
                break;
            case Position.EAST:
                position.setCardinality(Position.SOUTH);
                break;
            case Position.SOUTH:
                position.setCardinality(Position.WEST);
                break;
            case Position.WEST:
                position.setCardinality(Position.NORTH);
                break;
        }

    }

    public void turnLeft() {
        switch (this.position.getCardinality()) {
            case Position.NORTH:
                position.setCardinality(Position.WEST);
                break;
            case Position.WEST:
                position.setCardinality(Position.SOUTH);
                break;
            case Position.SOUTH:
                position.setCardinality(Position.EAST);
                break;
            case Position.EAST:
                position.setCardinality(Position.NORTH);
                break;
        }
    }

    public void move() {
        switch (this.position.getCardinality()) {
            case Position.NORTH:
                this.getPosition().setY(this.position.getY() + 1);
                break;
            case Position.EAST:
                this.getPosition().setX(this.position.getX() + 1);
                break;
            case Position.SOUTH:
                this.getPosition().setY(this.position.getY() - 1);
                break;
            case Position.WEST:
                this.getPosition().setX(this.position.getX() - 1);
                break;
        }

    }
}
