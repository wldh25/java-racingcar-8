package racingcar.view;

import racingcar.domain.Car;
import java.util.List;

public final class OutputView {
    private OutputView() {}

    public static void printStart() {
        System.out.println("실행 결과");
    }

    public static void printRound(List<Car> cars) {
        for (Car c : cars) {
            System.out.println(c.name() + " : " + "-".repeat(c.position()));
        }
        System.out.println(); // 라운드 구분 빈 줄
    }

    public static void printWinners(List<String> names) {
        System.out.println("최종 우승자 : " + String.join(", ", names));
    }
}
