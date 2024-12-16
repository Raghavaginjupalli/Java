package operators.ofjava.programs;

public class JavaRelational {
    public static void main(String[] args) {

        short a = 23;
        short b = 23;
        short c = 20;

        // Equal to (checks if two values are equal)
        System.out.println(a == b);             // True
        System.out.println(a == c);             // False

        // Not equal to (checks if two values are not equal)
        System.out.println(a != b);             // False
        System.out.println(a != c);             // True

        // Greater than (checks if the left operand is greater than the right)
        System.out.println(a > b);              // False

        // Less than (checks if the left operand is less than the right)
        System.out.println(a < b);              // False

        // Greater than or equal to (checks if the left operand is greater than or equal to the right)
        System.out.println(a >= b);              // True

        // Less than or equal to (checks if the left operand is less than or equal to the right)
        System.out.println(a <= b);              //  True




    }

}
