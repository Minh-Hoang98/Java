
package iteratordemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
 
public class IteratorDemo1 {
 
  public static void main(String args[]){
    ArrayList names = new ArrayList();
    names.add("Vuong Nguyen Minh Hoang");
    names.add("SE1305");
 
    Iterator it = names.iterator();
 
    while(it.hasNext()) {
      String obj = (String)it.next();
      System.out.println(obj);
    }
    names.add(0,"Ten"); // Thêm phần tử vào đầu ArrayList
    names.add(names.size(),"DE130119"); // Thêm phần tử vào cuối ArrayList
    for (Object name : names) {
        System.out.println(name.toString());
    }
    System.out.println(names.indexOf("SE1305")); // Tìm kiếm phần tử SE1305 trong ArrayList
    ArrayList me = new ArrayList(names);
    System.out.println(me.toString()); 
    Collections.reverse(me); // Đảo ArrayList
    System.out.println(me);
    Collections.sort(me); // Sắp xếp ArrayList
    Iterator iter = me.iterator();
    while (iter.hasNext())
	System.out.println(iter.next());
  }
}

