package Resizeable;

public class Test {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new  Shape[3];
        shapes[0] = new Circle(x, "red ", false);
        shapes[1] = new Square(x, "melinda", true);
        shapes[2] = new Rectangle(x,x, "infinity ", true);
        for (Shape a : shapes){
            System.out.println(a);
        }
        for (Shape a : shapes){
            a.resize(Math.random() * 1000);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
