package pkg13_recursion;

import java.util.Arrays;

public class Main {

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static long factorial(int n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return -1;
        }
        long res = 1;
        for (int i = 2; i < n + 1; ++i) {
            res *= i;
        }
        return res;
    }

    public static int nCr(int n, int r) {

        if (r > n) {
            return -1;
        }

        if (n == r) {
            return 1;
        }

        if (r == 0) {
            return 1;
        }

        return nCr(n - 1, r - 1)
                + nCr(n - 1, r);
    }

    static long stirlingNumber(int r, int n) {

        if (n > r) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        if (r == n) {
            return 1;
        }

        if (n == 1) {
            return factorial(r - 1);
        }

        if (r - n == 1) {
            return nCr(r, 2);
        } else {
            return stirlingNumber(r - 1, n - 1)
                    + (r - 1)
                    * stirlingNumber(r - 1, n);
        }
    }

    static int search(int arr[], int l, int h, int key) {
        if (l > h) {
            return -1;
        }

        int mid = (l + h) / 2;
        if (arr[mid] == key) {
            return mid;
        }

        if (arr[l] <= arr[mid]) {

            if (key >= arr[l] && key <= arr[mid]) {
                return search(arr, l, mid - 1, key);
            }

            return search(arr, mid + 1, h, key);
        }

        if (key >= arr[mid] && key <= arr[h]) {
            return search(arr, mid + 1, h, key);
        }

        return search(arr, l, mid - 1, key);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 7, 6, 7};
        char[] b = {'g', 'h', 'a', 'g', 'b'};

        System.out.println("Function 1: " + sum(3));
        Arrays.sort(a);

        int n = a.length; 
        int key = 3; 
        int i = search(a, 0, n-1, key);
        if (i != -1)  
            System.out.println("Index: " + i); 
        else
            System.out.println("Key not found"); 
        int r = 9, g = 2;
        long val = stirlingNumber(r, n);
        System.out.println("The Stirling Number s("
                + r + ", " + g + ") is : " + val);
    }
}


