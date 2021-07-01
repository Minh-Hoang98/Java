/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0061;

/**
 *
 * @author Laptop88
 */
public class Circle extends Shape{
    double radius;
    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
    public void printResult(){    
        System.out.println("-----Circle-----");
        System.out.println("radius: " +getRadius());
        System.out.println("Perimeter: "+getPerimeter());
        System.out.println("Area: "+getArea());
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}
