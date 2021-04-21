package fr.arolla.skocher.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public static String getValue(int input) {
        if (input % 3 == 0) {
            return FIZZ;
        }
        if (input == 5) {
            return "Buzz";
        }
        return Integer.toString(input);
    }
}
