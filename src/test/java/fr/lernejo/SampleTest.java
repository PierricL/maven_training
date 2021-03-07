package fr.lernejo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

class SampleTest {

    @Test
    void add_behave_as_expected() {

        int result = new Sample().op(Sample.Operation.ADD, 2, 5);

        assertThat(result).isEqualTo(7);
    }

    @ParameterizedTest
    @CsvSource ({
        "ADD, 1, 1, 2",
        "ADD, -1, 1, 0",
        "ADD, 1, 3, 4",
        "ADD, 100, -99, 1",
        "MULT, 2, 2, 4"
    })
    void add_behave_as_expected_various_cases(Sample.Operation operation, int a, int b, int expectedResult) {
        int result = new Sample().op(operation, a, b);

        assertThat(result).isEqualTo(expectedResult);
    }
}
