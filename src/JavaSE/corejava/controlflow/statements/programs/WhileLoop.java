package JavaSE.corejava.controlflow.statements.programs;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value;

//        while (value < 1 || value > 10) {
//            System.out.printf("The given %d is not in between 1 to 10. Try again ..   ", value);
//            value = input.nextInt();
//        }

        do{
            System.out.print("Please enter the value in between 1 to 10:  ");
            value = input.nextInt();

        } while (value < 1 || value > 10);

        System.out.println("The given "+ value +" is in between 1 to 10. Thanks!");


        // input closing
        input.close();
    }
}
