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
public class Array {

    public static int n;
    public static int[] array1;
    public static int[] array2;
    public static int[] array3;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
    }

    public static void Menu() {
        System.out.println("Welcome to Array exer");
        System.out.println("[1]Enter n: ");
        System.out.println("[2]Initialize 2 arrays have length equal n: ");
        System.out.println("[3]Checking value of each array: ");
        System.out.println("[4]Reorder 2 arrays: ");
        System.out.println("[5]Average of 2 arrays: ");
        System.out.println("[6]Goodbye");
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thanks");
                    break;
                default:
            }
        } while (choice != 6);

    }

    public static void inputNumber() {
        System.out.println("Enter number: ");
        n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            Menu();
        } else {
            System.out.println("Enter again: ");
            n = Integer.parseInt(sc.nextLine());
        }

    }

    public static void initTwoArrays() {
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number into array 1: ");
            array1[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number into array 2: ");
            array2[i] = Integer.parseInt(sc.nextLine());
        }

    }

    public static void checkValue() {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println("The value of array 1: " + i + "=" + array1[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.println("The value of array 2: " + i + "=" + array2[i]);
            }

            int[] array3 = new int[array1.length + array2.length];
            for (int i = 0; i < n; i++) {
                if (array3[i] > 0) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("The value of array 3: " + j + "=" + array3[j]);
                    }
                } else {
                    System.out.println("Error!");
                }
             }
        } else {
            Menu();
        }

    }

    public static void reorderArray() {
        for (int i = 0; i < n - 1; i++){
            for ( int j = i+1; j <= n - 1; j++){
                if (array1[j] < array1[i]){
                   int temp = array1[i];
                   array1[i] = array1[j];
                   array1[j] = temp;
                }
            }
            System.out.println("The new order array1: " + array1);
        }
        for (int i = 0; i < n - 1; i++){
            for ( int j = i+1; j <= n - 1; j++){
                if (array2[j] > array2[i]){
                   int temp = array2[i];
                   array2[i] = array2[j];
                   array2[j] = temp;
                }
            }
            System.out.println("The new order array2: " + array2);
        }

    }

    public static void averageValue() {
       float avgNumber =  array3[n]%2;
        System.out.println("The average is: " + avgNumber);
    }

}
