package MoveablePoint;

public class MoveablePoint extends Point {
    private float z = 0.0f;
    public MoveablePoint(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public MoveablePoint(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }
    public float[] setXYZ(){
        float[] test = new float[3];
        test[0] = this.z;
        test[1] = this.z;
        test[2] = this.z;
        return test;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}
