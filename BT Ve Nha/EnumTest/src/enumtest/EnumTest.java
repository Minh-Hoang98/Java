/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;

public class EnumTest {
    public enum Day {
   MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
    Day day;    
    public EnumTest(Day day) {
        this.day = day;
    }    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;                        
   default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
}
}

