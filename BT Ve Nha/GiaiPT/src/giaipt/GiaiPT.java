package giaipt;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GiaiPT {
	private static final Scanner in = new Scanner(System.in);
	public static void giaiPTBac1(){
		System.out.println("Nhập A: ");
		double a = checkInputDouble();
		System.out.println("Nhập B: ");
		double b = checkInputDouble();		
		if(a == 0){
			if(b == 0){
				System.out.println("Phương trình vô số nghiệm.");
			}
			else{
				System.out.println("Phương trình vô nghiệm.");
			}
		}
		else{
			System.out.println("Phương trình có nghiệm duy nhất: x = " + -b/a);
		}
		System.out.print("Number is odd: ");
		if(checkOdd(a)){
			System.out.print(a + " ");
		}
		if(checkOdd(b)){
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.print("Number is event: ");
		if(checkEven(a)){
			System.out.print(a + " ");
		}
		if(checkEven(b)){
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.print("Number is prefect square: ");
		if(checkSquareNumber(a)){
			System.out.print(a + " ");
		}
		if(checkSquareNumber(b)){
			System.out.print(b + " ");
		}
		System.out.println();
	}
	public static void giaiPTBac2(){
		
		System.out.println("Nhập A: ");
		double a = checkInputDouble();
		System.out.println("Nhập B: ");
		double b = checkInputDouble();
		System.out.println("Nhập C: ");
		double c = checkInputDouble();
		
		if(a == 0){		
			if(b == 0){
				if(c == 0){
					System.out.println("Phương trình vô số nghiệm.");
				}
				else{
					System.out.println("Phương trình vô nghiệm.");
				}
			}
			else{
				System.out.println("Phương trình có nghiệm duy nhất: x = " + -b/a);
			}
		}
		else {
			double delta = (b*b) - (4*a*c);
			double x1,x2;
			if(delta > 0){
				x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
				x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
				System.out.println("Phương trình có 2 nghiệm là: x1 = " + x1 +", x2 = " + x2);
			}
			else if(delta == 0){
				x1 = (-b / (2*a));
				System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x1);
			}
			else{
				System.out.println("Phương trình vô nghiệm");
			}
		}	
		System.out.print("Number is odd: ");
		if(checkOdd(a)){
			System.out.print(a + " ");
		}
		if(checkOdd(b)){
			System.out.print(b + " ");
		}
		if(checkOdd(c)){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.print("Number is event: ");
		if(checkEven(a)){
			System.out.print(a + " ");
		}
		if(checkEven(b)){
			System.out.print(b + " ");
		}
		if(checkEven(c)){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.print("Number is prefect square: ");
		if(checkSquareNumber(a)){
			System.out.print(a + " ");
		}
		if(checkSquareNumber(b)){
			System.out.print(b + " ");
		}
		if(checkSquareNumber(c)){
			System.out.print(c + " ");
		}
		System.out.println();
	}
	public static int checkInputIntLimit(int min, int max){
		while(true){
			try{
				int result = Integer.parseInt(in.nextLine().trim());
				if(result < min || result > max){
					throw new NumberFormatException();
				}
				return result;
			}catch(NumberFormatException e){
				System.err.println("Error!!!");
				System.out.println("Enter Again: ");
			}
		}
	}
	public static double checkInputDouble() { 
		while(true){			
        try{       	
        	double isNum = Double.parseDouble(in.next());          
            return isNum;	
                       	 
        } catch(NumberFormatException e) {
            System.err.println("Must be input double");
            System.out.println("Enter Again: ");
        }      	
		}
			
    }    
	
	public static boolean checkOdd(double n){
		if(n % 2 != 0){
			return true;
		}
		return false;
	}
	
	public static boolean checkEven(double n){
		if(n % 2 == 0){
			return true;
		}
		return false;
	}
	
	public static boolean checkSquareNumber(double n){
		if((int)Math.sqrt(n) * (int)Math.sqrt(n) == n){
			return true;
		}
		else{
			return false;
		}
	}
	public static int menu(){
		System.out.println("========= Equation Program =========");
		System.out.println("1. Calculate Superlative Equation");
		System.out.println("2. Calculate Quadratic Equation");
		System.out.println("3. Exit");
        System.out.println("Please choice one option: ");
        
        int choice = checkInputIntLimit(1,3);
        return choice;
	}
	public static void main(String[] args) {
		while (true) {
            int choice = GiaiPT.menu();
            switch (choice) {
                case 1:
                    giaiPTBac1();
                    break;
                case 2:
                    giaiPTBac2();
                    break;
                case 3:
                    System.exit(0);
                case 4: 
                    return; 
            }
	    }
	}
}

