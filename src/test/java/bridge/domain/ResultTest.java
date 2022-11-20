package bridge.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ResultTest {

    private Round round = new Round();
    private Result result = new Result(round);

    @DisplayName("첫 라운드에 맞춘 경우에는 첫번째 칸이 O가 된다.")
    @ParameterizedTest
    @CsvSource(value = {"U:[[   ], [ O ]]", "D:[[ O ], [   ]]"}, delimiter = ':')
    void correctFirstRound(String userInput, String output) {
        result.convertCorrectResultFirstRound(userInput);
        assertThat(result.getMap().toString()).isEqualTo(output);
    }
}