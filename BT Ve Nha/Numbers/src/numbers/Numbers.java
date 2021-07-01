
package numbers;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {
        
        List<Number> ls = new ArrayList<>(); // Khởi tạo mảng động ls
        
        ls.add(1342341); // Thêm giá trị nguyên vào mảng
        ls.add(new Float(34.56)); // Gọi kiểu Float và thêm giá trị vào mảng
        ls.add(235.242); // Thêm giá trị thực vào mảng
        ls.add(new Byte("102")); // Gọi kiểu Byte và thêm giá trị vào mảng
        ls.add(new Short("1245")); // Gọi kiểu Short và thêm giá trị vào mảng
       
        for (Number n : ls) {
            
            System.out.println(n.getClass()); // In ra tên class chứa n
            System.out.println(n); // In ra n
        }
    }
}
