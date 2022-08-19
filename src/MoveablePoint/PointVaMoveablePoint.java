package MoveablePoint;

import com.sun.deploy.net.MessageHeader;

public class PointVaMoveablePoint {
    public static void main(String[] args) {
        Point firstPoint = new Point(3, 4);
        Point firstMoveablePoint = new MoveablePoint(4, 5, 6);


        System.out.println(firstPoint.toString());
        System.out.println(firstMoveablePoint.toString());
    }
}
