package racingcar.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class Cars {
    private final List<Car> values;

    public Cars(List<Car> cars) {
        this.values = new ArrayList<>(cars);
    }

    public void moveAll(Move m) {
        for (Car c : values) {
            c.move(m);
        }
    }

    public List<Car> snapshot() { // 현재 상태 복사(읽기용)
        return List.copyOf(values);
    }

    public List<String> winnerNames() {
        int max = values.stream()
                .map(Car::position)
                .max(Comparator.naturalOrder())
                .orElse(0);

        return values.stream()
                .filter(c -> c.position() == max)
                .map(Car::name)
                .toList();
    }
}
