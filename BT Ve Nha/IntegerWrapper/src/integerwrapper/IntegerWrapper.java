
package integerwrapper;

public class IntegerWrapper {

    public static void main(String[] args) {
        
        int a = 55; // Khởi tạo số nguyên a có giá trị = 55
        Integer b = new Integer(a); //Khởi tạo b có giá trị nguyên a
        
        int c = b.intValue(); // Gán c là giá trị nguyên của b
        float d = b.floatValue();// Gán d là giá trị thực của b
        
        String bin = Integer.toBinaryString(a);// Chuyển giá trị của a thành chuỗi binary và gán vào bin
        String hex = Integer.toHexString(a);// Chuyển giá trị của a thành hexa và gán vào hex 
        String oct = Integer.toOctalString(a);// Chuyển giá trị của a thành octal và gán vào oct      
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        System.out.println(bin);
        System.out.println(hex);
        System.out.println(oct);            
    }
}
   
    

