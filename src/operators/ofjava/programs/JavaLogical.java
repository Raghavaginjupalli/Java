package operators.ofjava.programs;

public class JavaLogical {
    public static void main(String[] args) {

        short a = 23;
        short b = 23;
        short c = 20;

        // Logical AND (returns true if both operands are true)
        System.out.println((a == b) && (a == c));       // False because a is not equal to c.

        // Logical OR  (returns true if at least one operand is true)
        System.out.println((a == b) || (a == c));       // True because, one condition is true.

        // Logical NOT  (returns true, if condition is false or vise versa.)
        System.out.println(!(a == b) );                 // False because, condition is true.

    }
}
