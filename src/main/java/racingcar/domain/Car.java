package racingcar.domain;

public final class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(Move m) {
        if (m.movable()) {
            position++;
        }
    }

    public String name()    { return name; }
    public int position()   { return position; }
}
