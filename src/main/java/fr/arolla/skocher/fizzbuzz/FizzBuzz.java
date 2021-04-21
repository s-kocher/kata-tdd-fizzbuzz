package fr.arolla.skocher.fizzbuzz;

public class FizzBuzz {

    private enum FizzBuzzValue {
        FizzBuzz(15, "FizzBuzz"),
        Fizz(3, "Fizz"),
        Buzz(5, "Buzz");

        int divider;
        String label;

        FizzBuzzValue(int divider, String label) {
            this.divider = divider;
            this.label = label;
        }

        private boolean isDivisableBy(int input) {
            return input % divider == 0;
        }
    }

    public static String getValue(int input) {
        FizzBuzzValue specialValue = isInputSpecialValue(input);
        if (specialValue != null) {
            return specialValue.label;
        }

        return Integer.toString(input);
    }

    private static FizzBuzzValue isInputSpecialValue(int input) {
        for (FizzBuzzValue value : FizzBuzzValue.values()) {
            if (value.isDivisableBy(input)) {
                return value;
            }
        }
        return null;
    }


}
