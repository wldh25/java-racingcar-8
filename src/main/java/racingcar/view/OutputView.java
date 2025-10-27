package racingcar.view;

import racingcar.domain.CarName;

import java.util.List;

public class OutputView {
    private OutputView() {}

    public static void outputCarName(List<CarName> names) {
        System.out.println("입력된 자동차들: " + String.join(", ", names.stream().map(CarName::value).toList()));
    }
}
