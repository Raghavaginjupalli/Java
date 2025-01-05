package JavaSE.corejava.operators.ofjava.programs;

public class JavaIncrementDecrement {
    public static void main(String[] args) {

        short x = 10;

        // Pre-increment (increments before using the value)
        System.out.println(++x);        // output: 11 because, x increased 1

        // Post-increment (increments after using the value)
        System.out.println(x++);        // output: 11 because, x increased 1 after it's value printed.
        System.out.println(x);          // output: 12 because, x increased by 1 before statement.
        //NOTE: but, in the before statement value printed before increment, so we could see value in the before statement.

        // Pre-decrement (decrement before using the value)
        System.out.println(--x);        // output: 11 because, x decreases 1

        // Post-decrement (decrement after using the value)
        System.out.println(x--);        // output: 11 because, x decreases 1 after it's value printed.
        System.out.println(x);          // output: 10 because, x decreases by 1 before statement.
        //NOTE: but, in the before statement value printed before decrement, so we could see value in the before statement.

    }
}
