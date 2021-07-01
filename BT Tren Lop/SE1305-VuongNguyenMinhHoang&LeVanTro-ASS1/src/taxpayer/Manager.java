package taxpayer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;

public class Manager {

    public static int menu() {
        System.out.println("==========Taxpayer List=============");
        System.out.println("1.Load data from file.");
        System.out.println("2.Input and add to end.");
        System.out.println("3.Display data.");
        System.out.println("4.Save data to file.");
        System.out.println("5.Search by code.");
        System.out.println("6.Delete by code.");
        System.out.println("7.Sort by code");
        System.out.println("8.Input & add to beginning");
        System.out.println("9.Add after position k.");
        System.out.println("10.Delete position k");
        System.out.println("0.Exit");
        System.out.println("====================================");
        System.out.println("Enter your choice:  ");
        int choice = Valididate.checkInputLimit(0, 10);
        return choice;
    }

    public static TaxpayerList loadData(TaxpayerList a) {
        String fTaxpayer = "taxpayer.txt";
        RandomAccessFile f;
        String s;
        StringTokenizer sT;
        try {
            f = new RandomAccessFile(fTaxpayer, "r");
            while ((s = f.readLine()) != null) {
                sT = new StringTokenizer(s, "   ");
                String code = sT.nextToken().trim();
                String name = sT.nextToken().trim();
                double income = Double.parseDouble(sT.nextToken().trim());
                double tax = Double.parseDouble(sT.nextToken().trim());
                double deduct = Double.parseDouble(sT.nextToken().trim());
                a.add(new Taxpayer(code, name, income, tax, deduct));
            }
            f.close();
        } catch (IOException e) {
            System.out.println("Check again!");
        }
        return a;
    }

    public static void addTaxpayer(TaxpayerList a) {
        System.out.print("Enter Code: ");
        String code = Valididate.checkInputString();
        if (Valididate.checkCodeExist(a, code)) {
            System.err.println("Code is existed");
            return;
        }
        System.out.print("Enter Name: ");
        String name = Valididate.checkInputString();
        System.out.print("Enter Income: ");
        double income = Valididate.checkInputDouble();
        double tax = Valididate.getTax(income);

        double deduct = (income * tax) / 100;
        a.add(new Taxpayer(code, name, income, tax, deduct));
        System.err.println("Add successful!");
    }

    public static void displayTaxpayer(TaxpayerList a) {
        System.out.printf("%10s |%10s |%10s |%10s|%10s\n", "code", "name", " income", " tax", "deduct");
        for (int i = 0; i < a.size(); i++) {
            System.out.printf("%10s |%10s |%10.2f |%10.2f |%10.2f\n", a.getNode(i).info.code, a.getNode(i).info.name, a.getNode(i).info.income, a.getNode(i).info.tax, a.getNode(i).info.deduct);
        }
    }

    public static void saveData(TaxpayerList a) {
        String fProduct = "taxpayer.txt";
        RandomAccessFile f;
        try {
            f = new RandomAccessFile(fProduct, "rw");
            NodeT p = a.head;
            while (p != null) {
                f.writeBytes(p.info.code + "   " + p.info.name + "   " + p.info.income
                        + "   " + p.info.tax + "   " + p.info.deduct + "\r\n");
                p = p.next;
            }
            f.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void searchByCode(TaxpayerList a) {
        System.out.print("Enter code that you want to search: ");
        String cd = Valididate.checkInputString();
        NodeT s = a.search(cd);
        if (s == null) {
            System.err.println("Not Found!");
        } else {
            System.err.println("Found!");          
        }
    }

    public static void deleteByCode(TaxpayerList a) {
        System.out.print("Enter code that you want to delete: ");
        String cd = Valididate.checkInputString();
        if (!Valididate.checkCodeExist(a, cd)) {
            System.err.println("Code not existed!");
        } else {
            a.dele(cd);
            System.err.println("Delete successful!");
        }

    }

    public static void sortTaxpayerFollowTax(TaxpayerList a) {
        a.sort(a);
        System.err.println("Sort follow tax successful!");
    }

    public static void addBegin(TaxpayerList a) {
        System.out.print("Enter Code: ");
        String code = Valididate.checkInputString();
        if (Valididate.checkCodeExist(a, code)) {
            System.err.println("Code is existed");
            return;
        }
        System.out.print("Enter Name: ");
        String name = Valididate.checkInputString();
        System.out.print("Enter Income: ");
        double income = Valididate.checkInputDouble();
        double tax = Valididate.getTax(income);
        double deduct = (income * tax) / 100;       
        a.add(new Taxpayer(code, name, income, tax, deduct));
        System.err.println("Add successful!");
    }

    public static void addPosition(TaxpayerList taxpayer) {
        System.out.print("Enter position that you want to add:  ");
        int k = Valididate.checkPositionK(taxpayer);
            System.out.print("Enter code:  ");
            String code = Valididate.checkInputString();
            if (Valididate.checkIdExist(taxpayer, code)) {
                System.err.println("Code existed!");
                System.out.println("Enter again!");
                return;
            }
            System.out.print("Enter name:  ");
            String name = Valididate.checkInputString();
            System.out.print("Enter income:  ");
            double income = Valididate.checkInputDouble();
            double tax = Valididate.getTax(income);
            double deduct = (income * tax) / 100;
            taxpayer.addPosition(k, new Taxpayer(code, name, income, tax, deduct));
             System.err.println("Add Position successful");

    }
    public static void delePosition(TaxpayerList taxpayer) {
         System.err.print("Enter position that you want to delete:  ");
         int k=Valididate.checkPositionK(taxpayer);      
         taxpayer.deletePosition(k);
    }
}
