package fr.arolla.skocher.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_1_for_number_1() {
        int input = 1;

        String result = FizzBuzz.getValue(input);

        assertEquals("1", result);
    }

    @Test
    public void should_return_2_for_number_2() {
        int input = 2;

        String result = FizzBuzz.getValue(input);

        assertEquals("2", result);
    }

    @Test
    public void should_return_Fizz_for_number_3() {
        int input = 3;

        String result = FizzBuzz.getValue(input);

        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_for_number_6() {
        int input = 6;

        String result = FizzBuzz.getValue(input);

        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_for_number_5() {
        int input = 5;

        String result = FizzBuzz.getValue(input);

        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Buzz_for_number_10() {
        int input = 10;

        String result = FizzBuzz.getValue(input);

        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_FizzBuzz_for_number_15() {
        int input = 15;

        String result = FizzBuzz.getValue(input);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_FizzBuzz_for_number_30() {
        int input = 30;

        String result = FizzBuzz.getValue(input);

        assertEquals("FizzBuzz", result);
    }

}
