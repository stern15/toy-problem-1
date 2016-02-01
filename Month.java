/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package month;
import java.util.*;
/**
 *
 * @author semasuka
 */
public class Month {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       
        System.out.println("please enter the month number");
        
        int monthName=input.nextInt();
        
        switch(monthName){
            case 1:
                System.out.println("the month is January");
                break;
            case 2:
                System.out.println("the month is Febuary");
                break;
            case 3:
                System.out.println("the month is March");
                break;
            case 4:
                System.out.println("the month is April");
                break;
            case 5:
                System.out.println("the month is May");
                break;
            case 6:
                System.out.println("the month is June");
                break;
            case 7:
                System.out.println("the month is July");
                break;
            case 8:
                System.out.println("the month is August");
                break;
            case 9:
                System.out.println("the month is September");
                break;
            case 10:
                System.out.println("the month is October");
                break;
            case 11:
                System.out.println("the month is November");
                break;
            case 12:
                System.out.println("the month is December");
                break;
            default:
                System.out.println("invalid input");
                break;
            
            
        }
        
    }
    
}
