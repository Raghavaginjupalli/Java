package operators.ofjava.programs;

public class JavaCasting {
    public static void main(String[] args) {

        /*
        Casting we have two types: Implicit and Explicit.
        Implicit Casting:
            happens automatically when converting from low range to high range data type.
            > Converting int to a Long/Double/float.
            > Convert float to Double

        Explicit Casting:
            Doesn't happen automatically. should be done by programmer when converting high to low range data type.
            NOTE: Because of converting high to low, there is a data loss.
            > Converting Double/float/Long to int.
            > Converting Double to float.
         */

        // Implicit casting
        double d1 = 4;          // int -> double
        double d2 = 5.4F;       // float -> double
        long l = 23;            // int -> long

        // ERRORS
//        int i1 = 4.5;           int -> double
//        int i2 = 5L;            float -> double
//        float f = 23.5;         int -> long

        int i1 = (int)4.5;         // 4.5 -> 4 (Data loss)
        int i2 = (int)5L;
        float f = (float) 23.5;

    }
}
