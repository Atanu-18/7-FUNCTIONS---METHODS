//Make a function to print the table of a given number n.

import java.util.Scanner;

public class practice3 {

    //function declaration
    public static void printTable(int num) {
        System.out.println("Multiplication Table of " + num + " :");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printTable(num);
        sc.close();
    }
}
