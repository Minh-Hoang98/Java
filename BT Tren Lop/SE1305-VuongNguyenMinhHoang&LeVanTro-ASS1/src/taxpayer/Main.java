/*
 Assignment 1  - Income tax
 Class ID          : SE1305 
 Student ID        : DE130119 - DE130100
 Student Name      : Vương Nguyễn Minh Hoàng
 Due Date          : 16/06/2019
 I declare that this assignment is my team
 in accordance with FPT University
*/

package taxpayer;

import taxpayer.Manager;
import taxpayer.TaxpayerList;


public class Main {
    public static void main(String[] args) {
        TaxpayerList a=new TaxpayerList();
        while(true){
            int choice=Manager.menu();
            switch(choice){
                case 1:
                    Manager.loadData(a);
                    break;
                case 2:
                    Manager.addTaxpayer(a);
                    break;
                case 3:
                    Manager.displayTaxpayer(a);
                    break;
                case 4:
                    Manager.saveData(a);
                    break;
                case 5:
                    Manager.searchByCode(a);
                    break;
                case 6:
                    Manager.deleteByCode(a);
                    break;
                case 7:
                    Manager.sortTaxpayerFollowTax(a);
                    break;
                case 8:
                    Manager.addBegin(a);
                    break;                       
                case 9:
                    Manager.addPosition(a);
                    break;
                case 10:
                    Manager.delePosition(a);
                    break;
                case 0:
                    return ;            
            }
        }
    }
}
