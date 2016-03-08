package cl.alcastic;

/**
 * Created by acastillo on 07-03-16.
 */
public class Driver {
    private static final char RIGHT = 'D';
    private static final char LEFT = 'I';
    private static final char MOVE = 'M';
    private MilkCar milkCar;
    private Region region;

    public Driver(MilkCar milkCar, Region region) {
        this.milkCar = milkCar;
        this.region = region;
    }

    public String drive(String instructions) {
        for (char step : instructions.toCharArray()) {
            switch (step) {
                case RIGHT:
                    milkCar.turnRight();
                    break;
                case LEFT:
                    milkCar.turnLeft();
                    break;
                case MOVE:
                    milkCar.move();
                    break;
                default:
                    throw new CommandNotFoundException();
            }
            if (!region.isInside(milkCar.getLocation().getX(), milkCar.getLocation().getY())) {
                throw new CrashException();
            }
        }
        return milkCar.getLocation().toString();
    }

    public class CrashException extends RuntimeException {
    }

    public class CommandNotFoundException extends RuntimeException {
    }
}
