
package java_quanlydocgia;

import java.util.Scanner;

public class CNgay {
    private int Ngay, Thang, Nam;

        public void Nhap()
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("\nNhap ngay: ");
            Ngay = Integer.parseInt(scan.nextLine());

            System.out.print("\nNhap thang: ");
            Thang = Integer.parseInt(scan.nextLine());

            System.out.print("\nNhap nam: ");
            Nam = Integer.parseInt(scan.nextLine());
        }

        public void Xuat()
        {
            System.out.println("Ngay " + String.valueOf(Ngay) + " thang " + String.valueOf(Thang) + " nam " + String.valueOf(Nam));
        }
}
