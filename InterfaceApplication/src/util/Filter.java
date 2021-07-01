package util;

import data.Student;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/doit.now.oha
 * version 20.0330
 */

//Phiên bản 1 - KHÔNG XÀI GENERIC - CHỈ LÀM FILTER/BỘ LỌC VỚI STUDENT

//Hội Filter (interface - class Cha) - là Hội tập hợp những kẻ HộiViên 
//mà mỗi trong số chúng thích đi xét nét/đánh giá SinhViên

//Ta là BỘ LỌC, Cha của các loại bộ lọc khác nhau trên cuộc đời này
//Lọc theo điểm, Lọc theo năm sinh, Lọc theo xếp hạng xét cho cùng đều là Bộ Lọc. 
//Ta chỉ nói chung chung vậy thôi, mỗi Đứa lọc thế nào tự làm đi - Bộ Lọc Cụ Thể
//hãy implement cách Mày lọc đi

//Hội này có quy tắc, quy ước (hàm abstract) là:
//-> sẽ đánh giá/check() 1 SinhViên x nào đó và trả về kết quả true/false

//Nhấn mạnh Hội Filter chỉ nói là sẽ đánh giá check() SV x trả về true/false thoy
//còn cách đánh giá chi tiết thế nào tùy mỗi HộiViên (class Con) khi tham gia Hội Filter này

//Ví dụ có HộiViên SinhNămChẵn thì sẽ thích cách đánh giá SinhViên (implement hàm check())
//theo tiêu chí là chấp nhận những bạn SV x có năm sinh chẵn (chia hết cho 2)

//Ví dụ có HộiViên ĐiểmTámTrởLên thì sẽ thích cách đánh giá SinhViên (implement hàm check())
//theo tiêu chí là chấp nhận những bạn SV xcó điểm gpa >= 8

public interface Filter {
    
    public boolean check(Student x); //Trả về true/false tùy cách mình đánh giá một SV x 
                                     //theo tiêu chuẩn nào đó
}                                    
                                     //Các class Con có quyền viết hàm check() trả về
                                     //true/false theo cách của riêng class Con
                                     
                                     //Ví dụ:
                                     //trả về true nếu SV x đưa vào có điểm trung bình >=8