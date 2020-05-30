package sim;

import java.util.Objects;

public class Room {

    private final int number;

    public Room(int number) {
        this.number = number;
    }

    // TODO - implement some more interesting properties for the room. For example, a price based on its quality/size.

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return number == room.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
