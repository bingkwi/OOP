/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bich Quynh
 */
public class IntegerNumber {

    public static int n;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
    }

    public static void Menu() {
        System.out.println("---WELCOME TO MY APP----");
        System.out.println("[1]Enter integer number: ");
        System.out.println("[2]Checking odd or even: ");
        System.out.println("[3]Checking prime from 1 to n: ");
        System.out.println("[4]Checking square number from 1 to n: ");
        System.out.println("[5]Sum from 1 to n: ");
        System.out.println("[6]Exit ");
        System.out.println("==========================================");
        System.out.print("Enter your choice: ");
    }

    public static void init() {
        int choice;
        do {
            Menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputNumber();
                    break;
                case 2:
                    isEvenOrOdd(n);
                    break;
                case 3:
                    isPrime(n);
                    break;
                case 4:
                    checkPerfectSquare(n);
                    break;
                case 5:
                    sumNum();
                    break;
                case 6:
                    System.out.println("Thanks and see u.");
                    break;
                default:
            }
        } while (choice != 6);

    }

    public static void inputNumber() {
        System.out.println("Enter your number: ");
        n = Integer.parseInt(sc.nextLine());
    }

    public static void isEvenOrOdd(int n) {
        n = Integer.parseInt(sc.nextLine());
        if (n % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd");
        }
    }

    private static void isPrime(int n) {
        if (n < 1) {
            System.out.println("This is not prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    break; //Neu thay chia het roi thi k can kiem tra nua
                }
            }
            System.out.println("The list of prime number is: ");
        }
    }

    private static void checkPerfectSquare(int n) {
        double sq = Math.sqrt(n);
        System.out.println("The number of perfect square: " + (sq - Math.floor(sq) == 0));
    }

    private static void sumNum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += n + 1;
        }
        System.out.println("The sum is : " + sum);
    }
}
