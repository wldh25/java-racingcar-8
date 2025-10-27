package racingcar.domain;

import java.util.Objects;

public final class CarName {
    // 자동차 이름 제한
    private static final int MIN = 1;
    private static final int MAX = 5;

    private final String value;

    private CarName(String value) {
        this.value = value;
    }

    public static CarName of(String raw) {
        if (raw == null) {
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }
        String trimmed = raw.trim();
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }
        int len = trimmed.length();
        if(len < MIN || len > MAX) {
            throw new IllegalArgumentException("이름은 1 ~ 5자까지 가능합니다.");
        }
        return new CarName(trimmed);
    }

    public String value() {return value;}

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarName)) return false;
        CarName carName = (CarName) o;
        return value.equals(carName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
