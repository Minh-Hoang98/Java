             
package hoang;

abstract class Shape 
{ 
    protected String color;
    protected boolean filled;
    public Shape(String color,boolean filled ){
        this.color=color;
        this.filled=filled;
    }
    public Shape(){
        color="blue";
        filled=true;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    } 
    public boolean isFilled(){
       return filled; 
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
     @Override
    public String toString(){
        return "color: "+this.color+" filled: "+this.filled;
    }
       
} 
class Circle extends Shape
{ 
  protected double radius;
  public Circle(){ 
      super();
      radius=5.0;
  }
  public Circle(double radius){
      this.radius=radius;
  }
  public Circle(double radius,String color, boolean filled){
      super(color,filled);
       this.radius=radius;
  }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
  @Override
     double getArea(){
         return Math.PI*radius*radius;
     }
 
  @Override
   double getPerimeter(){
       return Math.PI*radius*2;
   }
  @Override
    public String toString(){
       return "Circle [radius= "+radius+ ", color=" + color + ", filled=" +  filled + "]";
    }
}
   class Rectangle extends Shape{
     protected  double width;
      protected double length;
       public Rectangle(){
           super();     
           width=2;
           length=4;
       }
       public Rectangle(String color,boolean filled){
          super(color,filled);
           width=2;
           length=4;
       }
       public Rectangle(double width,double length,String color,boolean filled){
           super(color,filled);
           this.width=width;
           this.length=length;
       }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;}
       @Override
        double getArea(){
            return width*length;
        }
       @Override
        double getPerimeter(){
            return (width+length)*2;
        }                  
       @Override
       public String toString(){
           return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" +  filled + "]";
       }
       
   }
   class Square extends Rectangle{
	protected double side;

	public Square() {
		super();
              super.width=side;
              super.length=side;
              side=2;
	}
        public Square(double side) {
		super();
		this.side = side;
	}
	public Square(String color, boolean filled,double side) {
		super(color, filled);
                this.side=side;
	}
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
        @Override
	public void setWidth(double side) {
		this.side = side;
	}
        @Override
	public void setLength(double side)
	{
		this.side = side;
	}

        @Override
	public String toString() {
		return "Square [side=" + side + ", width=" + width + ", length=" + length + ", color=" + color + ", filled="
				+ filled + "]";
	}
	
}
        public class Hoang{
                public static void main(String[] args) {
            Shape s1 = new Circle(5.5, " RED ", false);  
                System.out.println(s1);                    
                System.out.println(s1.getArea());        
                System.out.println(s1.getPerimeter());    
                System.out.println(s1.getColor());
                System.out.println(s1.isFilled());
                // System.out.println(s1.getRadius());  khog the goi object getRadius trong abtract lass Shape.
            Circle c1 = (Circle)s1;                 
                System.out.println(c1);
                System.out.println(c1.getArea());
                System.out.println(c1.getPerimeter());
                System.out.println(c1.getColor());
                System.out.println(c1.isFilled());
                System.out.println(c1.getRadius());
            //Shape s2 = new Shape(); 
            Shape s3 = new Rectangle(1.0, 2.0, "RED", false);  
                System.out.println(s3);
                System.out.println(s3.getArea());
                System.out.println(s3.getPerimeter());
                System.out.println(s3.getColor());
            //    System.out.println(s3.getLength());

            Rectangle r1 = (Rectangle)s3;  
                System.out.println(r1);
                System.out.println(r1.getArea());
                System.out.println(r1.getColor());
                System.out.println(r1.getLength());

            Shape s4 = new Square(6.6);     
                System.out.println(s4);
                System.out.println(s4.getArea());
                System.out.println(s4.getColor());
                //System.out.println(s4.getSide());

            Rectangle r2 = (Rectangle)s4;
                System.out.println(r2);
                System.out.println(r2.getArea());
                System.out.println(r2.getColor());
               // System.out.println(r2.getSide());
                System.out.println(r2.getLength());
            Square sq1 = (Square)r2;
                System.out.println(sq1);
                System.out.println(sq1.getArea());
                System.out.println(sq1.getColor());
                System.out.println(sq1.getSide());
                System.out.println(sq1.getLength());
              }

}