/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Basic;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Bich Quynh
 */
public class Triangle {

    public static int a;
    public static int b;
    public static int c;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
    }

    public static void Menu() {
        System.out.println("Welcome to menu");
        System.out.println("1. Input the length's triangle");
        System.out.println("2. Checking triangle");
        System.out.println("3. Calculate triangle area");
        System.out.println("4. Calculate triangle circumference");
        System.out.println("5. Checking is that a special traingle");
        System.out.println("6. Exit");
    }

    public static void init() {
        int choice;
        do {
            Menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputLength();
                    break;
                case 2:
                    checkingIsTriangle(a, b, c);
                    break;
                case 3:
                    calAreaTriangle(a, b, c);
                    break;
                case 4:
                    calCir(a, b, c);
                    break;
                case 5:
                    checkIsSpec(a, b, c);
                    break;
                case 6:
                    System.out.println("Thanks. See you again");
                    break;
                default:

            }
        } while (choice != 6);
    }

    public static void inputLength() {
        System.out.println("Enter the length a = ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the length b = ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the length c = ");
        c = Integer.parseInt(sc.nextLine());

    }

    public static void checkingIsTriangle(int a, int b, int c) {
        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("This is not a triangle");
        }
    }

    public static double calAreaTriangle(int a, int b, int c) {
        int p = (a + b + c) / 2;
        double S = sqrt(p*(p - a)*(p - b)*(p - c));
        System.out.println("Dien tich tam giac la: " + S);
        return S;
    }

    public static int calCir(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The circumference is: " + sum);
        return sum;
    }

    public static void checkIsSpec(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            System.out.println("This is tam giac can");
        } else if (a == b && b == c && c == a) {
            System.out.println("This is tam giac deu");
        } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
            System.out.println("This is right triangle");
        } else {
            System.out.println("this is not a special one.");
        }
    }

}
