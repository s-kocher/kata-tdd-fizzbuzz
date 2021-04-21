package fr.arolla.skocher.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String getValue(int input) {
        if (input % 3 == 0) {
            return FIZZ;
        }
        if (input == 5) {
            return BUZZ;
        }
        return Integer.toString(input);
    }
}
