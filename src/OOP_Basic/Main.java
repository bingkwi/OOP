/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Basic;

import java.util.Scanner;

/**
 *
 * @author Bich Quynh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("[1] Excersice 1: Integer number");
        System.out.println("[2] Excersice 2: Triangle");
        System.out.println("[3] Excersice 3: Array");
        System.out.println("[4] Excersice 4: Student and mark");

        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                //hien thi menu cua bai tap 1
                IntegerNumber.Menu();
                break;
            case 2:
                Array.Menu();
                break;
            case 3:
                Triangle.Menu();
                break;
            case 4:
                StudentAndMark.Menu();
                break;
            case 5:
                System.out.println("Thanks. See you again");
                break;
            default:

        }

    }

}
