
package P0061;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {   
        Scanner a = new Scanner(System.in);
        Rectangle b = new Rectangle();
        Circle c = new Circle();
        Triangle d = new Triangle();              
        
        System.out.println("=====Calculator Shape Program=====");
        System.out.println("Please input side width of Rectangle: ");
        double with = a.nextDouble();
        System.out.println("Please input length of Rectangle: ");
        double length = a.nextDouble();
        System.out.println("Please input radius of Circle: ");
        double radius = a.nextDouble();
        System.out.println("Please input side A of Triangle: ");
        double sideA = a.nextDouble();
        System.out.println("Please input side B of Triangle: ");
        double sideB = a.nextDouble();
        System.out.println("Please input side C of Triangle: ");
        double sideC = a.nextDouble();
        b.setLength(length);
        b.setWidth(with);
        c.setRadius(radius);
        d.setSideA(sideA);
        d.setSideB(sideB);
        d.setSideC(sideC);
        b.printResult();
        c.printResult();
        d.printResult();
        
        
        
        
    }
}
