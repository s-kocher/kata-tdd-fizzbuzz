package fr.arolla.skocher.fizzbuzz;

public class FizzBuzz {

    public static String getValue(int input) {
        if (input == 3) {
            return "Fizz";
        }
        return Integer.toString(input);
    }
}
