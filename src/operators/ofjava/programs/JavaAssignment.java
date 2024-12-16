package operators.ofjava.programs;

public class JavaAssignment {
    public static void main(String[] args) {

        short a;
        float b = 23;

        // Simple assignment (assigns the value of the right operand to the left operand)
        System.out.println(a = 20);       // By using = we assign 25 value to a.

        // Add and assign (adds the right operand to the left operand and assigns the result to the left)
        System.out.println(a += 3);       // By using += we add 3 to a, and assign to a. ( a = a + 3 )

        // Subtract and assign (subtracts the right operand from the left and assigns the result)
        System.out.println(a -= 3);       // By using -= we minus 3 to a, and assign to a. ( a = a - 3 )

        // Multiply and assign (multiplies the left operand by the right and assigns the result)
        System.out.println(a *= 3);      // By using *= we multiply 3 to a, and assign to a. ( a = a * 3 )

        // Divide and assign (divides the left operand by the right and assigns the result)
        System.out.println(a /= 3);       // By using /= we divide a by 3, and assign to a. ( a = a / 3 )

        // Modulus and assign (remainder of the division of the left operand by the right and assigns the result)
        System.out.println(b %= 3);       // By using += we divide b by 3, and assign remainder of these to a. ( b = b % 3 )
    }
}
