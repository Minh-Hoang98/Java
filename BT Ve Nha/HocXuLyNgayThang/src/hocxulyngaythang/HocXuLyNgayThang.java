
package hocxulyngaythang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HocXuLyNgayThang {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int nam = cal.get(Calendar.YEAR);
        System.out.println("Năm nay là: "+ nam);
        int thang = cal.get(Calendar.MONTH);
        System.out.println("Tháng này là tháng: "+ (thang+1));
        int ngay = cal.get(Calendar.DATE);
        System.out.println("Hôm nay là ngày: "+ ngay);
        Date t = cal.getTime();
        System.out.println(t);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Hôm nay: "+sdf.format(t));
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy :  HH:mm:ss");
        System.out.println("Hôm nay: "+sdf1.format(t));
    }
    
}
