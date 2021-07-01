
package xoakhoangtrang;

class XoaKhoangTrang {

    public static void main(String[] args) {
        String s = "    Nguyen  Van   Teo    ";
        System.out.println(s);
        s = s.trim();
        String []arr = s.split(" ");
        String sToiUu ="";
        for(String tu : arr)
        {
            if(tu.trim().length() != 0)
            sToiUu += tu +" ";
        }
        sToiUu = sToiUu.trim();
        System.out.println(sToiUu);
    }
    
}
