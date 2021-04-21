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

}
