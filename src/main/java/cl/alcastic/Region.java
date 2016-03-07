package cl.alcastic;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by acastillo on 07-03-16.
 */
@Getter
@Setter
public class Region {
    private int height;
    private int width;

    public Region(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public boolean isInside(int x, int y) {
        return (x >= 0) && (y >= 0) && (x <= width) && (y <= height);
    }
}
