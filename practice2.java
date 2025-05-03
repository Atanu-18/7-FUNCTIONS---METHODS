// Make a function to check if a given number n is even or not.

import java.util.Scanner;

public class practice2 {

    // declaration Function
    public static boolean evenNumber(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        evenNumber(n);

        if (evenNumber(n)) {
            System.out.println("This is Even no : " + n);
        } else {
            System.out.println("This is not Even no : " + n);
        }
        sc.close();
    }
}
