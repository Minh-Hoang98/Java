package LinearSearch;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array :");
        int length = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter search value: ");
        int search = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length);
        }
        
        LinearSearch searcher = new LinearSearch();
        System.out.print("The array : ");
        searcher.displayArray(array);
        int foundIndex = searcher.linerSearch(array, search);
        System.out.println("\nFound " + search + " at index: " + foundIndex);
    }
    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
    public int linerSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
}
