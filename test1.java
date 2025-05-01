// Make a function to add 2 no's & return the sum

import java.util.Scanner;

public class test1 {

    // function declaration 
    public static int sumNumber(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = sumNumber(n1, n2);
        System.out.println("Sum of two no is : " + sum);         // function call

        sc.close();
    }
}
