package main;

import data.Student;
import util.Filter;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/doit.now.oha
 * version 20.0330
 */

//HộiViên này là dạng người chuyên đi đánh giá/chơi với SV theo điểm
//Hắn muốn lọc/chơi/check ai có điểm trung bình lớn hơn = 8 thì bảo rằng, đúng là SV này
//Hàm check() trả về true nếu điểm tb SV >= 8
//Đây là bộ lọc SV có điểm >= 8, cũng là 1 dạng bộ Lọc/Filter  

//Ta có thể chơi bộ lọc kiểu anonymous cho rồi, hoặc cú pháp Lambda trong tình huống này
//đều được, đỡ phải tạo 1 class mà chỉ có 1 hàm, phí
public class FilterByGPA implements Filter {

    @Override
    public boolean check(Student x) {
        return x.getGpa() >= 8; 
    }   
        //Viết tắt của if(x.getGpa() >= 8)
        //                 return true;
        //             return false
    
}
