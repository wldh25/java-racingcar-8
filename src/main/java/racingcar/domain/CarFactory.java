package racingcar.domain;

import java.util.List;

public final class CarFactory {
    private CarFactory() {}

    public static Cars fromNames(List<CarName> names) {
        if (names == null || names.size() < 2) {
            throw new IllegalArgumentException("자동차는 최소 2대 이상이어야 합니다.");
        }
        var cars = names.stream()
                .map(n -> new Car(n.value()))
                .toList();
        return new Cars(cars);
    }
}