package JavaSE.corejava.controlflow.statements.programs;
import java.util.Scanner;


public class switchCondition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Chose the item from given list (Mango, Apple, Box, Bat) :  ");

        String chosen = input.next().toLowerCase();

        if (chosen.equals("mango")){
            System.out.println("Mango is a good fruit");
        } else if (chosen.equals("apple")){
            System.out.println("Apple is a good fruit");
        } else if (chosen.equals("box")){
            System.out.println("Box is a good item");
        } else if (chosen.equals("bat")){
            System.out.println("Bat is a good Play");
        } else {
            System.out.println("Please Choose the item in the given list (Mango, Apple, Box, Bat)");
        }

        switch (chosen){
            case "mango":
                System.out.println("Mango is a good fruit");
                break;
            case "apple":
                System.out.println("Apple is a good fruit");
                break;
            case "box":
                System.out.println("Box is a good item");
                break;
            case "bat":
                System.out.println("Bat is a good for play");
                break;
            default:
                System.out.println("Please Choose the item in the given list (Mango, Apple, Box, Bat)");
        }




    }


}
