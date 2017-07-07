package msobdev.weatherapp.Model;

/**
 * Created by sob1 on 07.07.2017.
 */

public class Wind {
    private double speed;
    private int deg;

    public Wind(double speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }
}
