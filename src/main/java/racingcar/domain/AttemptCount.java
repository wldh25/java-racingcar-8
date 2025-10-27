package racingcar.domain;

public final class AttemptCount {
    private final int value;

    public AttemptCount(int value) {
        this.value = value;
    }

    public static AttemptCount of(String inputLine) {
        if (inputLine == null) {
            throw new IllegalArgumentException("시도 횟수를 입력하세요.");
        }
        String trimmed = inputLine.trim();
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("시도 횟수를 입력하세요.");
        }

        final int count;
        try {
            count = Integer.parseInt(trimmed);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 1 이상의 정수여야 합니다.");
        }
        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상의 정수여야 합니다.");
        }

        return new AttemptCount(count);
    }

    public int value() {
        return value;
    }
}
