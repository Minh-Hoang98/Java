package main;

import util.*;
import data.*;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/doit.now.oha
 * version 20.0330
 */

//Ví dụ dưới đây sử dụng mảng SV cho quen thuộc với mọi người
//Các bạn có thể thay bằng Collection (List-ArrayList, Set-HashSet,...) mà không khiến
//tư duy và logic bài toán bị thay đổi.
//Ta đang bàn về tính ứng dụng của Interface, cách các hàm thống nhất với nhau về tên gọi
//hàm và sử dụng/triệu gọi hàm,
//sau đó là linh hoạt trong cách cài đặt, sử dụng, mở rộng, tổng quát hóa trong việc
//phối hợp lẫn nhau - đó là ý nghĩa chính của Interface

//BÀI TOÁN NÀY MÔ PHỎNG LỆNH SQL SELECT * FROM STUDENT WHERE ĐIỀU_KIỆN_LỌC_SINH_VIÊN
//DÙNG INTERFACE ĐỂ LINH HOẠT CÀI ĐẶT ĐIỀU KIỆN LỌC, MÀ KO CẦN LÀM TỪNG HÀM RIÊNG CHO
//MỖI LẦN LỌC KHÁC NHAU

public class Main {
    public static void main(String[] args) {
        Student list[] = initStudentList(); //khởi động danh sách SV
        
        //Lọc SV có điểm TB >= 8, chính là gã FilterByGPA đã cài đặt hàm check() >= 8
        //FilterByGPA thì cũng là 1 dạng/class Con của class Cha Filter ấy mà        
        Filter whereGPA8 = new FilterByGPA();
        selectStudents(list, whereGPA8); 
                                        //Hàm selectStudents() sẽ nhờ whereGPA8 xét
                                        //từng cháu SV trong mảng có thỏa check() >= 8
                                        //hay ko, thỏa thì in ra thoy, đơn giản mà
                                        
                                        //Hàm selectStudents() biết trước rằng thế mẹ nào
                                        //whereGPA8 cũng có sẵn hàm check() do đã
                                        //thống nhất trước rằng hàm selectStudents()
                                        //sẽ chơi với bất kì đứa nào là Con của Filter,
                                        //mà là Con của Filter 101% MÀY PHẢI CÓ HÀM CHECK()
                                        
                                        //Bạn xem có giống ý tưởng
                                        //Collections.sort(list, Comparator) hok nào, ahihi
                                        //Collections.sort(list mà Comparable)
                                        //Thế mẹ nào 2 cái thằng sort() này cũng biết chắc
                                        //cái tham số đưa vào có sẵn hàm compare() 
                                        //và compareTo() cứ thế mà nhờ 2 hàm này check()
                                        //giùm, nó ung dung nhận kết quả và làm việc
                                        //nó đc giao, y chang hàm selectStudents() của mình
                                        
                                        //INTERFACE, MÀY THẬT LƯU MANH, THỐNG NHẤT TRƯỚC,
                                        //GÀI TRƯỚC TÊN HÀM PHẢI CÓ ĐỂ BỐ GỌI
        
        //Anonymous hoặc cú pháp Lambda cho các đk Filter khác, ví dụ lọc năm sinh 
        //trong khoảng nào đó cho trước
        //Éo cần tạo class rời X là Con của Filter cho mất sức, vì ta chỉ cần chỗ 
        //để implement các hàm abstract thoy mà, giống bên abstract class á
        
        //Riêng Interface chỉ có 1 hàm abstract đc gọi là Functional Interface
        //và khi đó anonymous sẽ đc thay bằng cú pháp Lambda (chỉ áp dụng cho 
        //Interface có duy nhất 1 hàm abstract)
        Filter where1990To1995 = new Filter() {
            @Override
            public boolean check(Student x) {
                return x.getYob() >= 1990 && x.getYob() <= 1995;
            }
        };
        selectStudents(list, where1990To1995);
        
        //Cú pháp Lambda cho cùng bộ lọc 1990..1995
        //Chỉ cần hàm check() có code thoy mà
        Filter where1990To1995Lambda = (x) -> x.getYob() >= 1990 && x.getYob() <= 1995;
        selectStudents(list, where1990To1995Lambda);
    
    }
    
    //Tao là hàm selectStudents(?, ?) nhận vào danh sách SV
    //Tao sẽ lọc danh sách SV cho tụi bay
    //Tao cũng chấp nhận Bộ Lọc linh hoạt Filter, 
    //tụi bay muốn Lọc thế nào thì cứ việc chỉ ra cách lọc chi tiết
    
    //Nếu tụi bay đưa ra giấy chứng nhận bộ lọc đã nêu ở trên, tao sẽ xử lí/lọc danh sách SV
    //theo cách tụi bay muốn
    
    //Tao mở cửa trong hàm của tao ra để giao tiếp với thế giới bên ngoài theo cách thế
    //giới bên ngoài muốn
    
    //Tao thống nhất rằng tao sẽ chơi theo kiểu Filter, mày cứ đưa vào cách mày muốn 
    //Filter đi, tao sẽ gọi .check() của Filter mày đưa vào, 
    //tao giao tiếp với thế giới bên ngoài theo cách bên ngoài muốn (hàm check() bên ngoài
    //viết sẵn code lọc một SV cụ thể theo tiêu chí nào đi, cái rồi thảy vào trong cho tao)
    
    //giống như cái Tivi vậy, người dùng nhấn remote, trong Tivi sẽ xử lí theo cách bên 
    //ngoài đã định nghĩa cho cái nút vậy
    
    //TODO: NÂNG CẤP HÀM NÀY SỬ DỤNG FILTERGENERIC, TA CHẤP CÁC LOẠI DANH SÁCH CẦN FILTER
    //MÀ KHÔNG BỊ GẮN CHẾT CỨNG VÀO DANH SÁCH SINH VIÊN
    //DỄ MÀ, BẠN THỬ ĐI...
    
    public static void selectStudents(Student list[], Filter whereCondition) {
        if(list.length == 0) {
            System.out.println("The list is empty. Nothing to filter");
            return;
        }
        System.out.println("The student list after filtering");
        for (Student x : list) {
            if(whereCondition.check(x)) //Tao xử lí danh sách sv theo cách tụi mày đưa vào
                x.showProfile();  //Tao thống nhất giao tiếp với bên ngoài qua tiêu chuẩn
        }                         //Filter do bên ngoài đưa vào, hàm check() bên ngoài
                                  //đưa vào, tao chỉ lọc giùm danh sách SV theo check() thoy 
    }                             //TODO: bổ sung thêm biến flag để thông báo
                                  //ko có SV nào đc tìm thấy thỏa bộ lọc, việc này dễ mà
    
    //Khởi tạo 10 SV khác nhau, làm nguồn cho hàm khác
    //Có thể xài ArrayList cũng cùng nguyên tắc
    public static Student[] initStudentList() {
        Student list[] = new Student[10];
        list[0] = new Student("SE01", "Một", 1991, 1.0);
        list[1] = new Student("SE02", "Hai", 1992, 2.0);
        list[2] = new Student("SE03", "Ba", 1993, 3.0);
        list[3] = new Student("SE04", "Bốn", 1994, 4.0);
        list[4] = new Student("SE05", "Năm", 1995, 5.0);
        list[5] = new Student("SE06", "Sáu", 1996, 6.0);
        list[6] = new Student("SE07", "Bảy", 1997, 7.0);
        list[7] = new Student("SE08", "Tám", 1998, 8.0);
        list[8] = new Student("SE09", "Chín", 1999, 9.0);
        list[9] = new Student("SE10", "Mười", 2000, 10.0);
        return list;
    }
    
}
