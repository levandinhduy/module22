package ss6_kethua_bai1;

public class Cyinder extends Circle {
    private double height = 1.0;

    public Cyinder() {
        super();
    }

    public Cyinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", height=" + height +
                ", volume=" + getVolume() +
                '}';
    }
}