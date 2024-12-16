package operators.ofjava.programs;

public class JavaArithmetic {
    public static void main(String[] args) {

        byte a = 12;
        byte b = 23;
        String s = "My";

        // Addition operators
        // NOTE: Using "+", if both operands should be digits then addition, one operand is string then concatenation.

        int sum = a + b;
        System.out.println(sum);          // Addition      output: 35
        System.out.println(s + a);        // Concatenation output: My12

        // Subtraction operators
        int subtract = a - b;
        System.out.println(subtract);

        // Multiplication operators
        int multiplication = a * b;
        System.out.println(multiplication);

        // Division operators
        int division = b / a;
        System.out.println(division);
        // NOTE: In divisible, high range by low range, then the output will be high range data type.
        //       If we divide same range, the output also same data type.


        // Modulus operators
        int modulus = a % b;
        System.out.println(modulus);
    }
}
