package basics.ofjava.programs;

public class PrintStatements {

    public static void main(String[] args) {

        // print:
        System.out.print("Hello");
        System.out.print(" World!");        // Output: Hello World!
        // NOTE: If you want cursor in the same line after print, use "print".

        // println:
        System.out.println();
        System.out.println("Hello");          // Output: Hello
        System.out.println("World!");        // Output: World!
        // NOTE: If you want cursor in the new line after print, use "println".

        /*
         // printf:

         Placeholders (Format Specifiers):
            %d: Integer
            %f: Floating-point number
            %s: String
            %n: Newline
            %c: Character
            %b: Boolean
        */

        int age = 28;
        System.out.printf("Raghava Age is : %d%n", age);

        // With Padding
        System.out.printf("Padded number: %5d%n", age); // Padded number:    28

        double Pi = 3.1459;
        // In the float or double you can restrict the decimal value after point.
        // You can specify in between "% and f" the digits you want, like ".2" means two digits after point.
        System.out.printf("Value of PI is: %.2f%n", Pi);

        // Padding with specific digits after point.
        // You can specify between "% and .2f" the Padding you want, like "8" in this statement.
        System.out.printf("Padded Pi: %8.2f%n", Pi);    // Padded Pi:     3.14

        // NOTE: For string you need to declare in the "" only.
        String name = "Raghava";

        System.out.printf("Name: %s%n", name);          // Name: Raghava

        // With padding
        System.out.printf("Padded name: %10s%n", name); // Padded name:      Raghava

        // NOTE: For char you need to declare in the '' only.
        // Char stores only a single character at a time.
        char initial = 'G';
        System.out.printf("Initial: %c%n",initial );    // Initial: G

        // Combination of all data types
        System.out.printf("Name: %s, Age: %d, PI: %.2f%n", name, age, Pi);


    }
}