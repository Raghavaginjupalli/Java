package JavaSE.corejava.controlflow.statements.programs;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {

        System.out.println("                Using String input and casting method   ");
        System.out.print("Please Enter 4 Digit your Lucky number :  ");
        Scanner input = new Scanner(System.in);

    // By using String input and casting method.

        String number = input.next();

        // For consume after the next().
        input.nextLine();


        char c1 = number.charAt(0);
        char c2 = number.charAt(1);
        char c3 = number.charAt(2);
        char c4 = number.charAt(3);

        // Using ASCII value addition input 1234 (char of (1==49 int value, 2==50 int value, 3==51 int value, 4==52 int value in ASCII) )
        int l1 = c1 + c2;
        int l2 = c3 + c4;

        // Using Numerical value addition input of 1234.
        int l3 = (c1 - '0') + (c2 - '0');       // l3 = 1 + 2
        int l4 = (c3 - '0') + (c4 - '0');       // l4 = 3 + 4

        /*
        NOTE: IF you subtract ('1' - '0') it will give 1 of integer value.
        In Java, characters (char) are internally represented as numeric Unicode values.
        These values correspond to the ASCII values for characters.

          Character	  ASCII/Unicode Value
            '0'	             48
            '1'	             49
            '2'              50
            etc
        */

        if (l1 == l2){
            System.out.printf("The number %s is a lucky number since %c+%c = %c+%c", number, c1, c2, c3, c4);
        } else {
            System.out.printf("The number %s is not a lucky number since %c+%c != %c+%c", number, c1, c2, c3, c4);
        }



    //  By using Modules and divided method
        // 1234 / 10 = 123 |  1234 % 10 = 4
        System.out.println();
        System.out.println();
        System.out.println("            Using Modules and divided method   ");
        System.out.print("Please Enter 4 Digit your Lucky number :  ");

        int n1 = input.nextInt();

        int fourthn1 = n1 % 10;              // 1234 % 10 = 4
        int thriedn1 = (n1 / 10) % 10;       // (1234 / 10 = 123) & 123 % 10 = 3
        int secondn1 = (n1 / 100) % 10;      // (1234 / 100 = 12) & 12 % 10 = 2
        int firstn1 = (n1 / 1000) % 10;      // (1234 / 1000 = 1) & 1 % 10 = 1

        if (firstn1 + secondn1 == thriedn1 + fourthn1) {
            System.out.printf("The number %d is a lucky number since %d+%d = %d+%d", n1, firstn1, secondn1, thriedn1, fourthn1);
        }else {
            System.out.printf("The number %d is a lucky number since %d+%d = %d+%d", n1, firstn1, secondn1, thriedn1, fourthn1);
        }








        // Close the input
        input.close();

    }
}
