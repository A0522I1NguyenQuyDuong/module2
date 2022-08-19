package Circle;

public class Cylinder extends Circle{
    private double height = 0;

    public Cylinder(){

    }
    public Cylinder(double radius , double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(String color, String fillcolor, double radius, double height){
        super(color, fillcolor, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public Cylinder(String color, double radius, double height){
        super(color, radius);
    }
    public double getVolum(){
        return super.getArea() * this.height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getCircus() * this.height;
    }


    @Override
    public String toString() {
        return super.toString() +
        "+ chiều cao: " + this.getHeight() + "\n";
    }
}
