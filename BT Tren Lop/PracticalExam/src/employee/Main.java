package employee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Employee> abe = new ArrayList<>();
        HeapSort.add("F01", "CPU", 10, 200);
        HeapSort.add("F05", "USB", 15, 20);
        HeapSort.add("F02", "KeyBoard", 20, 15);
        HeapSort.add("F03", "Mouse0", 25, 10);
        HeapSort.add("F06", "LapTop", 10, 200);
        HeapSort.add("F04", "LCD", 30, 120);
        
        while (true) {
            int choice = HeapSort.menu();
            switch (choice) {
                case 1:
                    HeapSort.AddItem(abe);
                    break;
                case 2:
                    HeapSort.heapSort(abe);
                    HeapSort.Travese();
                    break;
                case 3:
                    HeapSort.search();
            }
        }
            
//        System.out.println("\t==========Item==========");
//        System.out.println();
//        HeapSort.Travese();
//        HeapSort.heapSort(HeapSort.a);
//        System.out.println();
//        System.out.println("\tItem Before Use Heap Sort");
//        System.out.println();
//        HeapSort.Travese();
//        HeapSort.search();
        
        
    }

}
