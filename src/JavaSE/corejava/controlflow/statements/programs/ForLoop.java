package JavaSE.corejava.controlflow.statements.programs;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        FibonacciSequence();

    }

    public static void PatternPrinting() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }

        for (int i = 100; i >= 1; i--) {

            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void StrictDivisors() {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the integer values : ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }

    public static void PrimeNumbers() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number bigger than 1 to check it is prime number (or) not? ");

        int n = input.nextInt();
        int sum = 1;

        while (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            System.out.println(sum == 1 ? "Prime Number" : "Not a Prime Number");
            sum = 1;
            n = input.nextInt();

        }
        System.out.printf("You entered %d, so now the program will exit!...", n);

    }

    public static void AddingInputInt() {
        Scanner input = new Scanner(System.in);

//        while (input.hasNext()){
//            int sum = 0;
//            String n = input.next();
//
//            for (int i = 0; i < n.length(); i++){
//                sum += n.charAt(i) - '0';
//            }
//            System.out.printf("The sum of %s is %d ", n, sum);
//        }
//        System.out.println("Please enter the valid integer");

        int n = input.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.printf("The sum of given number is %d", sum);
    }

    public static void FibonacciSequence() {

        int fb1 = 0;
        int fb2 = 1;
        int fibonacci;

        for (int i = 1; i <= 20; i++){
            System.out.printf("%d ",fb1);
            fibonacci = fb1 + fb2;
            fb1 = fb2;
            fb2 = fibonacci;

        }

    }
}
