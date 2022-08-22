package Baitap2;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return " A Square with side ="
                + getSide()
                + ", which is a subclass of "
                + super.toString();

    }

    @Override
    public void howtoColor() {
        System.out.println("Hình vuông: tô 4 cạnh");
    }
}