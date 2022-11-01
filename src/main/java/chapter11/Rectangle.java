package chapter11;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle (double length, double width) {
        setWidth(width);
        setLength(length);
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
