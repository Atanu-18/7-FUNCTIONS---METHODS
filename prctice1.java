//Make a function to check if a number is prime or not.

import java.util.Scanner;

public class prctice1 {

    //function declaration
    public static boolean isPrime(int number) {
        if(number <= 1) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;
        for(int i = 3; i <= number/2; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        isPrime(number);

        if (isPrime(number)) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
        sc.close();
    }
}
