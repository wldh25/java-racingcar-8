package racingcar;

import racingcar.domain.*;
import racingcar.infra.RandomMove;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        try {
            String carName = InputView.inputCarName();
            List<CarName> names = NameParser.parseCommaSeparated(carName);

            String count = InputView.readAttemptCountLine();
            AttemptCount attempts = AttemptCount.of(count);

            Cars cars = CarFactory.fromNames(names);
            RandomMove strategy = new RandomMove();

            OutputView.printMessage("\n실행 결과");
            for (int i = 0; i < attempts.value(); i++) {
                cars.moveAll(strategy);
                OutputView.printRound(cars.snapshot());
            }
            OutputView.printWinners(cars.winnerNames());
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }
}
