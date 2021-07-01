/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

public class Rectangle {
   private float length;
   private float width;
   
   public Rectangle() {
      length = 1.0f;
      width = 1.0f;
   }
   public Rectangle(float length, float width){
       this.length = length;
       this.width = width;
   }
   public float getLength() {
     return length; 
   }
   public float getWidth(){
       return width;
   }
   public void setLength(float length) {
   this.length = length;
   }
    public void setWidth(float width){
    this.width = width;
   }
    public double Area(){
        return length * width;
    }
    public double Perimeter(){
        return (length + width) * 2;
    }
    public String toString(){
        return "Rectangle[length = " + length + " width= " + width + "]" +
        " Area = " + Area() + " Perimeter = " + Perimeter();
    }
    public static void main(String[] args){
        Rectangle a1 = new Rectangle();
        System.out.println(a1);
        
        Rectangle a2 = new Rectangle(5.4f , 7.6f);
        System.out.println(a2);
        
        Rectangle a3 = new Rectangle();
        a3.setLength(8.0f);
        a3.setWidth(5.0f);
        System.out.println("Length: " + a3.getLength());
        System.out.println("Width: " + a3.getWidth());
        System.out.println("Area: " + a3.Area());
        System.out.println("Perimeter:" +a3.Perimeter());
    }
}

