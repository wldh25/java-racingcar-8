package racingcar;

import racingcar.domain.*;
import racingcar.infra.RandomMove;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1) 입력
        String carNameLine = InputView.inputCarName();             // Console.readLine() 사용
        List<CarName> names = NameParser.parseCommaSeparated(carNameLine); // 당신 프로젝트의 파서명 사용

        String attemptLine = InputView.readAttemptCountLine();
        AttemptCount attempts = AttemptCount.of(attemptLine);

        // 2) 준비
        Cars cars = CarFactory.fromNames(names);   // (최소 2대 검증 포함 권장)
        Move strategy = new RandomMove();  // 내부에서 Randoms.pickNumberInRange(0,9) 사용

        // 3) 실행 & 출력
        OutputView.printStart();
        for (int i = 0; i < attempts.value(); i++) {
            cars.moveAll(strategy);                // 차마다 movable() 호출되어 난수 1회씩 소비
            OutputView.printRound(cars.snapshot());
        }
        OutputView.printWinners(cars.winnerNames());
    }
}
