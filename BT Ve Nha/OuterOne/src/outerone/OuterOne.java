/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outerone;

public class OuterOne {
 	private int x = 1, y = 2;
	 public class InnerOne {
		 private int y = 2;
		 public void innerMethod() {
			 System.out.println("enclosing x is " + x);
			 System.out.println("y is  "+ y);
 		}
 	}
 	public void outerMethod(int x) {
 		System.out.println("x is " + x);
 	}
        public void abc(int y){
            System.out.println("y is " + y);
        }
 	public void makeInner() {
 		InnerOne anInner = new InnerOne();
		anInner.innerMethod();
	 }
	 // other methods...
        public static void main(String args[]) {
 	OuterOne o = new OuterOne();
 	OuterOne.InnerOne i = o.new InnerOne();
 	i.innerMethod();
        o.outerMethod(5);
        o.makeInner();
        o.abc(7);
 }

 }

