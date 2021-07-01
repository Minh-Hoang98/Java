
package movablepoint;

class Point{
    public float x = 0.0f;
    public float y = 0.0f;

    public Point() {
    }
   
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
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

public class MovablePoint extends Point{
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;

    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {
    }
    
    public float getxSpeed() {
        return xSpeed;              
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    public float[] getSpeed(){
        float[] Array = {xSpeed,ySpeed};
        return Array;
    }
    
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
    
    @Override
    public String toString() {
       return "("+x+","+y+")"+",Speed=" + xSpeed +","+ySpeed + ")";
    }
    public static void main(String[] args) {
        MovablePoint s1 = new MovablePoint(1.2f,5.7f,1.1f,8.9f);
        System.out.println(s1);
        System.out.println(s1.move());
    }    
}
