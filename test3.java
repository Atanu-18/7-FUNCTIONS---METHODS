//make a function to multiply 2 no's & rerturn product

import java.util.Scanner;

public class test3 {

    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a, b);         // call function

        System.out.println("The product of 2 no is : " + product);

        sc.close();
    }
}
