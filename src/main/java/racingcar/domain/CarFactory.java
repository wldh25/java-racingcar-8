package racingcar.domain;

import java.util.List;

public final class CarFactory {
    private CarFactory() {}

    public static Cars fromNames(List<CarName> names) {
        List<Car> cars = names.stream()
                .map(n -> new Car(n.value()))
                .toList();
        return new Cars(cars);
    }
}