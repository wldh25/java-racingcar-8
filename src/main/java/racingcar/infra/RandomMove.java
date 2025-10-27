package racingcar.infra;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Move;

public final class RandomMove implements Move {
    @Override
    public boolean movable() {
        int n = Randoms.pickNumberInRange(0, 9);
        return n >= 4;
    }
}
