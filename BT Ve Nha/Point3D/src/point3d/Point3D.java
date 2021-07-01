
package point3d;

import java.util.Arrays;

class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point2D(){}
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public float[] getXY(){
        float[] Array = {x,y};
        return Array;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
public class Point3D extends Point2D{
    public float z = 0.0f;
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public Point3D(){   
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public float[] getXYZ(){
        float[] Array = {x,y,z};
        return Array;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString(){
        return "("+x+","+y+","+z+")";
    }
    public static void main(String[] args) {
        Point2D s1 = new Point2D(2.1f,4.5f);
        System.out.println(s1);
        
        Point3D q1 = new Point3D(2.0f,3.7f,10.5f);
        System.out.println("X: "+q1.getX() + "\n" +
                           "Y: "+q1.getY() + "\n" +
                           "XYZ: "+ Arrays.toString(q1.getXYZ()));
    }
    
}
