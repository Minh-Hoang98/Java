package lopthuoctinhvaphuongthuc;

public class lopthuoctinhvaphuongthuc {
    public static void main(String[] args) {
        //tenlop tendoituong  = new tenlop();
        SVCNTT sv = new SVCNTT();
        sv.ten = "Vuong Nguyen Minh Hoang"; 
        sv.tuoi = 20; 
        sv.diem = 7; 
        sv.masv = 130119;
        sv.lop = "SE1305";
        System.out.println("Ten cua sv la : "+ sv.ten);
        System.out.println("Tuoi cua sv la : " + sv.tuoi);
        System.out.println("Diem cua sv la : " + sv.diem);
        System.out.println("MA so sv la : " + sv.masv);
        System.out.println("Lop cua sv la : " + sv.lop);
        
        sv.SinhVien();
        sv.DiemDanh();
        sv.GV();
        sv.Lop();
        sv.SVCNTT();
    }
}

class SinhVien {
    String ten;
    int tuoi;
    int diem;

    public void SinhVien(){
            System.out.println("La Sinh Vien Cua Truong");
}
    public void DiemDanh(){
            System.out.println("Sinh Vien Co Mat");
}
    public void GV(){
            System.out.println("Hoc Thay Hung");
}   
}

class SVCNTT extends SinhVien{
    String lop;
    int masv;
    public void SVCNTT(){
            System.out.println("Sinh Vien CNTT");
}
    public void Lop(){
            System.out.println("Hoc Lop SE1305");
    }
}