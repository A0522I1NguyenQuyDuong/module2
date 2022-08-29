package MoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint( float x,float y,float xSpeed, float ySpeed) {
        super (x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MoveablePoint() {

    }

//    public MovablePoint(float[] a) {
//        super(a[0],a[1] );
//    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        float[] test = new float[2];
        test[0]=this.xSpeed;
        test[1]=this.ySpeed;
        return test;
    }

    @Override
    public String toString() {
        return super.toString() +
                "+ speed: (" + this.xSpeed + "," + this.ySpeed + ")" + "\n";
    }

    public MoveablePoint move(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
        return this;
    }
}

