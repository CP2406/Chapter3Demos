import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomHelperTest {

    @Test
    void nextInt() {
        // generate tallies
        int[] tallies = new int[20];
        for (int i = 0; i < 1000; ++i) {
            int value = RandomHelper.nextInt(0, 19);
            tallies[value] += 1;
        }

        // check each value is generated at least once
        for (int value = 0; value < tallies.length; ++value) {
            assertTrue(tallies[value] > 0,
                    "value not generated: " + value);
        }
    }

    @Test
    void checkMathPow() {
        // setup data
        double expectedValue = 16.0; // 2^4 is 16
        int number = 2;
        int power = 4;

        // call production code
        double result = Math.pow(number, power);

        // check production code works
        assertEquals(expectedValue, result);
    }
}
