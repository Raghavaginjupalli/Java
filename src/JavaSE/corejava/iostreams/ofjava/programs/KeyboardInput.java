package JavaSE.corejava.iostreams.ofjava.programs;
import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

        // Scanner object creation
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter your first name :  ");
        String first_name = input.next();

        // To consume excess input after next():
        input.nextLine();

        System.out.print("Enter your full name :  ");
        String full_name = input.nextLine();

        System.out.println("This is your first name:" + first_name);
        System.out.println("This is your full name:" + full_name);

        System.out.print("Enter your favorite integer :  ");
        byte userInput = input.nextByte();

        System.out.println(userInput + " is my favorite integer too!");

        // To consume excess input after nextByte():
        input.nextLine();

        System.out.print("Please enter the Name:  ");
        String name = input.nextLine();

        int spaceIndex = name.indexOf(' ');

        String firstWord;

        if (spaceIndex !=-1) {
            firstWord = name.substring(0, spaceIndex);
            System.out.println(firstWord);
        } else {
            firstWord = name;
            System.out.println(firstWord);
        }



        // NOTE : IF you use other than nextLine() line after line, if you give value as a space and character then enter,
        //        automatically the next methode will consume the previous value after space until another space.


        // Close the scanner
        input.close();
    }

}
