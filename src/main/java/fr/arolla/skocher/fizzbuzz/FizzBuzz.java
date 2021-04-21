package fr.arolla.skocher.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public static String getValue(int input) {
        if (input == 3 || input == 6) {
            return FIZZ;
        }
        return Integer.toString(input);
    }
}
