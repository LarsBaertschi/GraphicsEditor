package ninja.lars.figuren;

import java.awt.*;

public class Kreis extends Figur {
    private int radius;

    public Kreis(int x, int y, Color lineColor, int radius) {
        super(x, y, lineColor);
        this.radius = radius;
    }

    @Override
    public void stretch(float factor) {
        this.radius = Math.round(factor * radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
