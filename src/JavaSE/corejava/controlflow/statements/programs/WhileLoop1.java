package JavaSE.corejava.controlflow.statements.programs;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        input - object  start taking input from user..
        !input.hasNextInt() - It won't consume the input value, instead just look value is integer or not?
        input.next(); - it consume the any input value, but it won't store because we are not assigning to any variable.
        String i = input.next(); - it consume the input value as String only, the value will store into String of "i".
        input.nextInt(); - it consume the input value in integer value only, but it won't store because we are not assigning to any variable.
        int i = input.nextInt(); - it consume the input value as integer only, the value will store into integer of "i".
        NOTE: next() will store any value as a String, but nextInt() will store only integers only, if you give other than that it will through error.
         */
        
        while (!input.hasNextInt()){
            System.out.println("Please enter valid integer, Try again.....");
            input.nextLine();
        }

        try {
            int i = input.nextInt();
            while (i > 0){
                System.out.println("The given value of i is : " + i);
                i = input.nextInt();
            }

        } catch (InputMismatchException e) {
            System.out.println("The program will exit now, because of your invalid input multiple times.");
        }

    }
}
