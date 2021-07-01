package j1.s.p0001;

import java.util.Scanner;

public class J1SP0001 {

    private static final Scanner in = new Scanner(System.in);

    //check user input a number integer
    private static int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.err.print("Enter again: ");
            }
        }
    }

    //allow user input number of array
    private static int inputSizeOfArray() {
        System.out.println("Enter number of Array: ");
        int n = checkInputInt();
        return n;
    }

    //allow user input value of array
    private static int[] inputValueOfArray() {
        int b = inputSizeOfArray();
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = checkInputInt();
        }
        return a;
    }

    //sort array by bubble sort 
    private static void sortArrayByBubbleSort(int[] a) {
        System.out.println("Unsorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    private static void print(int[] a) {
        System.out.println("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int n = inputSizeOfArray();
        int[] a = inputValueOfArray();
        sortArrayByBubbleSort(a);
        print(a);
    }

}
