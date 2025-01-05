package JavaSE.corejava.controlflow.statements.programs;
import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {

        int x=10;
        int y=10;

        if(x > y){
            System.out.println("X is bigger then y");
        } else if(x < y) {
            System.out.println("Y is bigger then x");
        } else {
            System.out.println("x & y are both equal");
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter first num :  ");
        double first_num = input.nextDouble();

        System.out.print("Please Enter a symbol(+,-,*,/,%) :  ");
        char operation = input.next().charAt(0);


        System.out.print("Please Enter a second num :  ");
        double sec_num = input.nextDouble();

        double result;

        switch(operation){
            case('+'):
                result = first_num + sec_num;
                System.out.print("The result is : " + result);
                break;

            case('-'):
                result = first_num - sec_num;
                System.out.print("The result is : " + result);
                break;

            case('*'):
                result = first_num * sec_num;
                System.out.print("The result is : " + result);
                break;

            case('/'):
                if(first_num == 0 || sec_num == 0 ){
                    System.out.print("The given value is not not divisible");
                } else {
                    result = first_num / sec_num;
                    System.out.print("The result is : " + result);
                }
                break;

            case('%'):
                if(first_num == 0 || sec_num == 0 ){
                    System.out.print("The given value is not divisible");
                } else {
                    result = first_num % sec_num;
                    System.out.print("The result is : " + result);
                }
                break;
            default:
                System.out.println("The given operation is not valid, So Please give in this (+,-,*,/,%)");
        }

        // Closing inputStream.
        input.close();
    }


}
