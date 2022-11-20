package bridge.domain;

import static bridge.util.Constant.FIRST_ROUND;

public class Round {

    private int round;

    public Round() {
        this.round = 0;
    }

    // 첫 라운드인지 판별하는 기능
    public boolean checkRoundFirst() {
        return round == FIRST_ROUND;
    }

    public int getRound() {
        return round;
    }
}