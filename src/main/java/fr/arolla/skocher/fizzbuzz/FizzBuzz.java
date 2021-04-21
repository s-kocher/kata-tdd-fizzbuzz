package fr.arolla.skocher.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public static String getValue(int input) {
        if (isDivisableBy(input, 15)) {
            return FIZZ_BUZZ;
        }
        if (isDivisableBy(input, 3)) {
            return FIZZ;
        }
        if (isDivisableBy(input, 5)) {
            return BUZZ;
        }
        return Integer.toString(input);
    }

    private static boolean isDivisableBy(int input, int divider) {
        return input % divider == 0;
    }
}
