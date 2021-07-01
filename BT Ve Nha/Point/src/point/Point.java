package point;

public class Point {
    private int x,y;
    private char pName;
    
    public Point(){}

    public Point(int x, int y, char pName) {
        this.x = x;
        this.y = y;
        this.pName = pName;
    }
    
    public Point(int n){
        n = x = y;
        pName = 'A';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getpName() {
        return pName;
    }

    public void setpName(char pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return pName +"(" + x + "," + y + ")";
    }
    
    public double distanceTo(Point p){
        return Math.sqrt((this.x - p.x)*(this.x-p.x)+(this.y - p.y)*(this.y-p.y));
    }   
    
    public static double distance(Point a, Point b){
        return a.distanceTo(b);
    }
    
    public Point doiXung(){
        return new Point(x,-y,'Z');
    }
}
