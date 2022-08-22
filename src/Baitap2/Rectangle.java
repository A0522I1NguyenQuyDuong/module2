package Baitap2;

public abstract class Rectangle extends Shape {
    private double wight = 1.0;
    private double height = 1.0;


    public Rectangle() {

    }

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    public Rectangle(double wight, double height, String color, boolean filled) {
        super(color, filled);
        this.wight = wight;
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return wight * this.height;
    }

    public double getPerimeter() {
        return 2 * (wight + this.height);
    }

    @Override
    public String toString() {
        return "A Rectangle with wight ="
                + getWight()
                + ", and height"
                + getHeight()
                + ", which is subclass of"
                + super.toString();
    }
    @Override
    public void howtoColor() {
        System.out.println("Hình chữ nhật : vẽ 4 cạnh");
    }
}