public class Point3D {
    private float x = 0.0f;
    private float y = 0.0f;
    private float z= 0.0f;
    float [] Array;

    {
        Array = new float[3];
    }

    public Point3D(){
    }
    public Point3D(float x, float y,float z){
        this.x =x;
        this.y =y;
        this.z =z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXY(float x, float y,float z){
        this.x =x;
        this.y =y;
        this.z =z;
    }

    public float[] getXY() {
        Array[0]=x;
        Array[1]=y;
        Array[2]=z;
        return Array;
    }
    public String toString(){
        return "Point3D có \t" + "x\t" + x+"\t" + "y\t"+ y+ "\t" + "z\t"+ z + "\t"
                + "Array\t" +getXY();
    }
}
