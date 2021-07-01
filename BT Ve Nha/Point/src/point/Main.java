
package point;

import java.util.Arrays;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
       Random r = new Random();
       Circle[] c = new Circle[10];
       for(int i=0;i < c.length;i++){
           c[i] = new Circle(Math.abs(r.nextDouble()),r.nextInt(10),r.nextInt(10),'A');
           System.out.println(c[i] + " Area = "+c[i].area());
       }
       Arrays.sort(c);
       for(Circle a: c) System.out.println(a);
    }
}
