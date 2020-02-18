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
public class StudentAndMark {
    public static int n;
    public static Scanner sc = new Scanner(System.in);
    public static String[] studentNameList;
    public static double[] studentMarkList;

    public static void main(String[] args) {
        init();
    }

    public static void Menu() {
        System.out.println("Welcome to my house");
        System.out.println("1. Input n");
        System.out.println("2. Input student name and mark");
        System.out.println("3. Sorted list name by alphabet");
        System.out.println("4. List student's name by mark type");
        System.out.println("5. List highest and lowest mark bt name ");
        System.out.println("6. Average mark by mark type");
        System.out.println("7. Change mark's student");
        System.out.println("8. Goodbye");
    }

    public static void init() {
        // TODO code application logic here
        int choice;
        do {
            Menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputNumber();

                    break;
                case 2:
                    studentData();

                    break;
                case 3:
                    ascendingName();

                    break;
                case 4:
                    listMarkProject();

                    break;
                case 5:
                    highestAndLowestMark();

                    break;
                case 6:
                    averageMark();
                    break;
                case 7:
                    changeMark();
                    break;
                case 8:
                    System.out.println("Thanks. See you again");
                    break;
                default:

            }
        } while (choice != 8);

    }

    public static int inputNumber() {
        System.out.println("Enter number of student: ");
        n = Integer.parseInt(sc.nextLine());
        studentMarkList = new double[n];
        studentNameList = new String[n];
        return n;
    }

    public static void studentData() {
        for (int i = 0; i < n; i++) {
            System.out.println("Student name: ");
            studentNameList[i] = sc.nextLine();

            System.out.println("Student mark: ");
            studentMarkList[i] = Double.parseDouble(sc.nextLine());

        }
    }

    public static void ascendingName() {
        String[] name = studentNameList;
        double[] mark = studentMarkList;
        String temp;
        double temp2;

        for (int i = 0; i <= studentNameList.length; i++) {
            for (int j = i + 1; j < studentNameList.length; j++) {
                if (studentNameList[i].compareTo(studentNameList[j]) > 0) {
                    temp = studentNameList[i];
                    studentNameList[i] = studentNameList[j];
                    studentNameList[j] = temp;
                    temp2 = studentMarkList[i];
                    studentMarkList[i] = studentMarkList[j];
                    studentMarkList[j] = temp2;
                }
            }
        }
        System.out.println("Names in Sorted Order: ");
        for (int i = 0; i <= name.length - 1; i++) {
            System.out.println(name[i] + ",");
        }

    }

    public static void listMarkProject() {
        int maxPos = 0;
        int minPos = 0;
        double max = studentMarkList[0];
        double min = studentMarkList[0];

        for (int i = 0; i < studentMarkList.length; i++) {
            if (studentMarkList[i] > max) {
                max = studentMarkList[i];
                maxPos = i;
            }
        }
        System.out.println("The student has highest mark is: " + max + studentNameList[maxPos]);

        for (int i = 0; i < studentMarkList.length; i++) {
            if (studentMarkList[i] < min) {
                min = studentMarkList[i];
                minPos = i;
            }
        }
        System.out.println("The student has lowest mark is: " + min + studentNameList[minPos]);
    }

    public static void highestAndLowestMark() {
        int maxPos = 0;
        int minPos = 0;
        double max = studentMarkList[0];
        double min = studentMarkList[0];

        for (int i = 0; i < studentMarkList.length; i++) {
            if (studentMarkList[i] > max) {
                max = studentMarkList[i];
                maxPos = i;
            }
        }
        System.out.println("The student has highest mark is: " + max + studentNameList[maxPos]);

        for (int i = 0; i < studentMarkList.length; i++) {
            if (studentMarkList[i] < min) {
                min = studentMarkList[i];
                minPos = i;
            }
        }
        System.out.println("The student has lowest mark is: " + min + studentNameList[minPos]);
    }

    public static void averageMark() {
        double markA = 0;
        double markB = 0;
        double markC = 0;
        double averageA = 0;
        double averageB = 0;
        double averageC = 0;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (int i = 0; i < studentMarkList.length; i++) {
            if (studentMarkList[i] >= 8.0) {
                markA = +studentMarkList[i];
                countA++;

            } else if (studentMarkList[i] <= 6.5 && studentMarkList[i] > 7) {
                markB = +studentMarkList[i];
                countB++;

            } else {
                markC = +studentMarkList[i];
                countC++;

            }

        }
        averageA = markA / countA;
        averageB = markB / countB;
        averageC = markC / countC;
        System.out.println("Good mark: " + averageA);
        System.out.println("Normal mark: " + averageB);
        System.out.println("Bad mark: " + averageC);

    }

    public static void changeMark() {
        String[] listNameMatch = new String[n];
        System.out.println("What does student name want to change mark: ");
        String nameInput = sc.nextLine();
        for (int i = 0; i < studentNameList.length; i++) {
            if (studentNameList[i].contains(nameInput)) {
                listNameMatch[i] = studentNameList[i];
                System.out.println((i + 1) + ". " + studentNameList[i]);
            }
        }
        System.out.println("Do you want to change mark: [Y/N]");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Which number do you choose: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Enter new mark: ");
            int newMark = Integer.parseInt(sc.nextLine());
            studentMarkList[id - 1] = newMark;
            System.out.println("Do you want to continue to change: [Y/N]");
            String choice2 = sc.nextLine();
            if (choice2.equalsIgnoreCase("Y")) {
                changeMark();
            } else {
                System.out.println("List student mark: ");
                for (int i = 0; i < studentMarkList.length; i++) {
                    System.out.println(i + ". " + studentNameList[i] + ": " + studentMarkList[i]);
                }
            }
        }
    }
}
