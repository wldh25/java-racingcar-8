package racingcar;

import racingcar.domain.AttemptCount;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.domain.CarName;
import racingcar.domain.NameParser;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        try {
            String carName = InputView.inputCarName();
            List<CarName> names = NameParser.parseCommaSeparated(carName);

            String count = InputView.readAttemptCountLine();
            AttemptCount attempts = AttemptCount.of(count);

        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }
}
