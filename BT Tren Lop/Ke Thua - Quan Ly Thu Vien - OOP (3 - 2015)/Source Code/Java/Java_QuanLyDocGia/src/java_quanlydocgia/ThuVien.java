/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_quanlydocgia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NguyenVietNamSon
 */
public class ThuVien {
    private ArrayList<DocGiaNguoiLon> ListDGNL = new ArrayList<DocGiaNguoiLon>();
    private ArrayList<DocGiaTreEm> ListDGTE = new ArrayList<DocGiaTreEm>();
    
    public void Nhap()
        {
            Scanner scan = new Scanner(System.in);
            int LuaChon;
	        do{
		        System.out.print("\n----------- Menu -----------\n");
		        System.out.print("\n1. Doc gia tre em");
		        System.out.print("\n2. Doc gia nguoi lon");
		        System.out.print("\n3. Thoat");
		        System.out.print("\n----------------------------\n");

		        do{
			        System.out.print("\nNhap vao lua chon cua ban: ");
			        LuaChon = Integer.parseInt(scan.nextLine());

			        if(LuaChon < 1 || LuaChon > 3)
			        {
				        System.out.print("\nLua chon khong hop le. Xin kiem tra lai !");
			        }
		        }while(LuaChon < 1 || LuaChon > 3);

		        if(LuaChon == 1) // Trẻ em
		        {
			        DocGiaTreEm a = new DocGiaTreEm();
			        a.Nhap();

			        ListDGTE.add(a);
			
		        }
		        else if(LuaChon == 2) // Người lớn
		        {
			        boolean Check;
			        DocGiaNguoiLon a = new DocGiaNguoiLon();
			        String cmnd;
			        a.Nhap();

			        do{
				
				        System.out.print("\nNhap vao CMND: ");
                        cmnd = scan.nextLine();

				        Check = true; // Mặc định ban đầu là chưa bị trùng

                        int size = ListDGNL.size();

				        // Kiểm tra mã cmnd không được trùng nhau giữa các độc giả người lớn
				        for(int i = 0; i < size; i++)
				        {
					        if(ListDGNL.get(i).getCMND().equals(cmnd) == true)
					        {
						        Check = false;
						        break;
					        }
				        }
				        if(Check == false)
				        {
				        System.out.print("\nMa so CMND da bi trung. Xin kiem tra lai !");
				        }
			        }while(Check == false);
                    a.setCMND(cmnd);
                    ListDGNL.add(a); // Nếu Check là true => thoát khỏi vòng lặp => lúc này push_back vào
		        }

	        }while (LuaChon != 3);
        }

        public void Xuat()
        {
            System.out.print("\n--------- Danh Sach Doc Gia Tre Em ---------\n");

            int sizetreem = ListDGTE.size();
            for (int i = 0; i < sizetreem; i++)
            {
                System.out.print("\nDoc gia thu " + String.valueOf(i + 1));
                ListDGTE.get(i).Xuat();
            }


            System.out.print("\n--------- Danh Sach Doc Gia Nguoi Lon ---------\n");

            int sizenguoilon = ListDGNL.size();
            for (int i = 0; i < sizenguoilon; i++)
            {
                System.out.print("\nDoc gia thu " + String.valueOf(i + 1));
                ListDGNL.get(i).Xuat();
            }
        }

        public float TinhTongTien()
        {
            float Tong = 0;

            int sizetreem = ListDGTE.size();
            for (int i = 0; i < sizetreem; i++)
            {
                Tong += ListDGTE.get(i).TinhTienLamThe();
            }

            int sizenguoilon = ListDGNL.size();
            for (int i = 0; i < sizenguoilon; i++)
            {
                Tong += ListDGNL.get(i).TinhTienLamThe();
            }
            return Tong;
        }
}
