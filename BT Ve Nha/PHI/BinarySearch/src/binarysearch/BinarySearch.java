package binarysearch;

import java.util.Scanner;
import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Array: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter search value: ");
        int search = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length);
        }
        BinarySearch searcher = new BinarySearch();
        searcher.bubbleSort(array);
        System.out.print("Sorted array: ");
        searcher.displayArray(array);

        int foundIndex = searcher.binarySearch(array, search, 0, length - 1);
        System.out.println("\nFound " + search + " at index: " + foundIndex);
    }

    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", " );
        }
        System.out.print("]");
    }

    public void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
 
    int binarySearch(int[] array, int value, int left, int right){
        if(left > right){
            return -1;
        }
        int middle = (left + right) / 2;
        if(array[middle] == value){
            return middle;
        }else if(array[middle] > value){
            return binarySearch(array,value,left,middle-1);    // r = mid - 1: tìm phía trái phần tử mid
        }else{
            return binarySearch(array,value,middle + 1,right); // l = mid + 1: tìm phía phải phần tử mid
        }
    }
}