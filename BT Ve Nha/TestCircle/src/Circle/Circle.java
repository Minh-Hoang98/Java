/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circle;

public class Circle {
   private double radius;
   private String color;
   
   // The default constructor with no argument.
   // It sets the radius and color to their default value.
   public Circle() {
      radius = 1.0;
      color = "red";
   }
   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
      this.radius = radius;
      color = "red";
   }
   public Circle(double radius, String color){
       this.radius = radius;
       this.color = color;
   }
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   public String getColor(){
       return color;
   }
   public void setRadius(double radius) {
   this.radius = radius;
}
 
// Setter for instance variable color
   public void setColor(String color){
    this.color = color;
}
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   @Override
   public String toString() {
   return "Circle[radius= " + radius + " color= " + color + "]";
   }
      public static void main(String[] args) {
      Circle c1 = new Circle(5.0);
      System.out.println(c1.toString());
      System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
      Circle c2 = new Circle(1.2);
      System.out.println(c2.toString());
      System.out.println("Operator '+' invokes toString() too: " + c2);
      Circle c3 = new Circle(3.7,"Pink");
      System.out.println(c3.toString());
      System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());
      Circle c4 = new Circle();
      c4.setRadius(5.0);
      System.out.println("radius is: " + c4.getRadius());
      c4.setColor("blue");
      System.out.println("color is " + c4.getColor());
   }
}
