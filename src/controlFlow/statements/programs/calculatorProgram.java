package controlFlow.statements.programs;

import java.util.Scanner;

public class calculatorProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter first value : ");
        // For consume first value
        int value1 = input.nextInt();

        // To consume excess input after nextInt():
        input.nextLine();

        System.out.print("Please choose given operation (+, -, *, /) : ");
        // For consume operation value
        String choose = input.next();
        char operation = choose.charAt(0);

        // To consume excess input after next():
        input.nextLine();

        System.out.print("Please Enter second value : ");
        // For consume second value
        int value2 = input.nextInt();


        // Calculator operations

        switch (operation){
            case '+':
                int sum = value1 + value2;
                System.out.println("The addition of give values is : "+ sum);
                break;

            case '-':
                int minus = value1 - value2;
                System.out.println("The subtraction of give values is : "+ minus);
                break;

            case '*':
                int multi = value1 * value2;
                System.out.println("The multiply of give values is : "+ multi);
                break;

            case '/':
                int devoid = value1 / value2;
                System.out.println("The devoid of give values is : "+ devoid);
                break;

            default:
                System.out.println("Please Enter integer values and given operations only (+, -, *, /) : ");
        }

        // Close the scanner
        input.close();
    }
}
