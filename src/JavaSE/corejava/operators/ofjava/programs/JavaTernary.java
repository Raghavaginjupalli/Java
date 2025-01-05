package JavaSE.corejava.operators.ofjava.programs;
import java.util.Scanner;

public class JavaTernary {
    public static void main(String[] args) {

        // condition ? expr1 : expr2 ;

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String result = (num % 2 ==0)? "It is even number": "It is not a even number" ;
        // NOTE: value data type should be match to variable type.

        System.out.println(result);

    }
}
