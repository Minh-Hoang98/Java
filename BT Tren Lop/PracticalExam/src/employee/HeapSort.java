package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HeapSort {
    
    static ArrayList<Employee> a = new ArrayList<Employee>();
    public final static Scanner in = new Scanner(System.in);

    public static int menu() {
        System.out.println("\t==========Item===========");
        System.out.println("1.Add a items in the list:");
        System.out.println("2.Print all element values on the screen:");
        System.out.println("3.Search item in the list:");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }
    
    public static void AddItem(ArrayList<Employee> list) {
        System.out.println("\t==========Manager Add Item===========");
        System.out.print("Enter ID:   ");
        String ID = Validation.checkInputString();
        System.out.print("Enter Item:   ");
        String item = Validation.checkInputString();
        System.out.print("Enter Quantity:   ");
        int quantity = Validation.checkInputInt();
        System.out.print("Enter Rate:     ");
        int rate = Validation.checkInputInt();
        a.add(new Employee(ID, item, quantity, rate));
        System.out.println("Add successful!");
    }
    public static void Travese() {
        System.out.println("\t==========Item===========");
        for (Employee p: a) {
            System.out.println(p);
        }
    }
    
    public static void add(String id, String item, int quantity, int rate) {
        Employee p = new Employee(id, item, quantity, rate);
        a.add(p);
    }
    
    public static void search () {
        int i=0;
        System.out.println("\t==========Search===========");
        System.out.println("");
        System.out.print("Enter Item Name To Search: ");
        String input = in.nextLine();
        for (Employee p : a) {
            if (input.equalsIgnoreCase(p.getItem())) {
                System.out.println(p);
                i++;
            }
        }
        if (i == 0) {
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Have " + i + "-Item");
        }
    }
    
    // Heap Sort
    public static void heapSort(ArrayList<Employee> list){
        int n = list.size();
        
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(list, n, i); 
        
        for (int i=n-1; i>=0; i--) 
        { 
            Collections.swap(list, 0, i);  
            heapify(list, i, 0); 
        } 
    }
    
    private static void heapify(ArrayList<Employee> list, int n, int i){
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2;
        
        if (l < n && list.get(l).compareTo(list.get(largest)) > 0){
            largest = l;
        }
        
        if (r < n && list.get(r).compareTo(list.get(largest)) > 0){
            largest = r;
        }
        
        if (largest != i){
            Collections.swap(list, i, largest);
            heapify(list, n, largest);
        }
    }
    
  
}
