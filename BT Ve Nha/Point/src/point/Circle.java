package point;

public class Circle extends Point implements Comparable<Circle>{
    private double radius;

    public Circle(){}

    public Circle(double radius, int x, int y, char pName) {
        super(x, y, pName);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }   

    @Override
    public String toString() {
        return "Circle{" + super.toString()+", R = " + radius + "}";
    }
            
    public double area(){
        return Math.PI*radius*radius;
    }
    
    public boolean isintersect(Circle c){
        return this.distanceTo(c) < this.radius+c.radius;
    }

    @Override
    public int compareTo(Circle o) {
        if(this.radius > o.radius) return 1;
        else if(this.radius < o.radius) return -1;
        else return 0;
    }

}
