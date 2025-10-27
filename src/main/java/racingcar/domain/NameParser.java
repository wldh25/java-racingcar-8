package racingcar.domain;

import java.util.Arrays;
import java.util.List;

public class NameParser {
    private NameParser() {}

    public static List<CarName> parseCommaSeparated(String line) {
        if (line == null) throw new IllegalArgumentException("입력이 없습니다.");
        String[] tokens = line.split(",");
        if (tokens.length == 0) throw new IllegalArgumentException("이름을 입력하세요.");

        return Arrays.stream(tokens)
                .map(CarName::of)
                .toList();
    }
}
