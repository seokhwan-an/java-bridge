package bridge.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RoundTest {

    private Round round = new Round();

    @DisplayName("현재 첫 라운드이면 true를 반환한다.")
    @Test
    void checkFirstRoundReturnTrue() {
        // when
        boolean firstRound = round.checkRoundFirst();

        // then
        Assertions.assertThat(firstRound).isTrue();
    }

    @DisplayName("한 게임 내 세 라운드가 지나면 라운드는 3이된다.")
    @Test
    void checkRoundAfter3Round() {
        // when
        for(int play = 1; play <= 3; play++){
            round.plusRound();
        }

        // then
        Assertions.assertThat(round.getRound()).isEqualTo(3);
    }
}