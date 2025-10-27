package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.domain.CarName;
import racingcar.domain.NameParser;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        try {
            String line = InputView.inputCarName();
            List<CarName> names = NameParser.parseCommaSeparated(line);
            OutputView.outputCarName(names);
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }
}
