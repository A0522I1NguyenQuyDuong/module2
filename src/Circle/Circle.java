package Circle;

public class Circle {
    private String color ="black";
    private String fillcolor = "white";
    private  double radius = 0;

    public Circle(String color, String fillcolor, double radius){
        this.color = color;
        this.fillcolor = fillcolor;
        this.radius = radius;
    }
    public Circle(){

    }
    public  Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFillcolor() {
        return fillcolor;
    }

    public void setFillcolor(String fillcolor) {
        this.fillcolor = fillcolor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "+ bán kính: " + this.getRadius() + "\n" +
                "+ màu: " + this.getColor() + "\n" +
                "+ màu bên trong: " + this.getFillcolor() + "\n";
    }

    public double getCircus(){
        return this.radius * 2 * Math.PI;



    }
}
