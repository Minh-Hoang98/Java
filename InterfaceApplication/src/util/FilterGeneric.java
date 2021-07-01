package util;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/doit.now.oha
 * version 20.0330
 */

//Phiên bản 2 - XÀI GENERIC - CHẤP CÁC LOẠI CLASS SẼ BỊ FILTER

//Hội Filter (interface - class Cha) - là Hội tập hợp những kẻ HộiViên 
//mà mỗi trong số chúng thích đi xét nét/đánh giá đối tượng T (class bất kì bị đánh giá)

//Ta là BỘ LỌC, Cha của các loại bộ lọc khác nhau trên cuộc đời này
//Lọc theo điểm, Lọc theo năm sinh, Lọc theo xếp hạng xét cho cùng đều là Bộ Lọc. 
//Ta chỉ nói chung chung vậy thôi, mỗi Đứa lọc thế nào tự làm đi - Bộ Lọc Cụ Thể
//hãy implement cách Mày lọc đi

//Hội này có quy tắc, quy ước (hàm abstract) là:
//-> sẽ đánh giá/check() 1 đối tượng <T> x nào đó và trả về kết quả true/false

//Nhấn mạnh Hội Filter chỉ nói là sẽ đánh giá check() <T> x trả về true/false thoy
//còn cách đánh giá chi tiết thế nào tùy mỗi HộiViên (class Con) khi tham gia Hội Filter này

//Ví dụ có HộiViên LươngKhủng thì sẽ thích cách đánh giá <T - NhânViên> 
//(implement hàm check()) theo tiêu chí là chấp nhận những bạn NhânViên x có 
//mức lương khủng >= 50 triệu chẳng hạn

public interface FilterGeneric<T> {
    
    public boolean check(T x); //Trả về true/false tùy cách mình đánh giá một đối tượng T
                               //theo tiêu chuẩn nào đó
}                              
                               //Các class Con có quyền viết hàm check() trả về
                               //true/false theo cách của riêng class Con
                               
                               //Ví dụ:
                               //trả về true nếu T SV x có năm sinh từ 1990..1995