package sim;

import java.util.Objects;

public class BusinessSummary {
    private final int profit;
    private final int guestsCheckedIn;
    private final int guestsTurnedAway;
    private final int guestsDeparted;
    private final int roomsAvailable;


    public BusinessSummary(int profit, int guestsCheckedIn, int guestsTurnedAway, int guestsDeparted, int roomsAvailable) {
        this.profit = profit;
        this.guestsCheckedIn = guestsCheckedIn;
        this.guestsTurnedAway = guestsTurnedAway;
        this.guestsDeparted = guestsDeparted;
        this.roomsAvailable = roomsAvailable;
    }

    @Override
    public String toString() {
        return "BusinessSummary{" +
                "profit=" + profit +
                ", guestsCheckedIn=" + guestsCheckedIn +
                ", guestsTurnedAway=" + guestsTurnedAway +
                ", guestsDeparted=" + guestsDeparted +
                ", roomsAvailable=" + roomsAvailable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessSummary that = (BusinessSummary) o;
        return profit == that.profit &&
                guestsCheckedIn == that.guestsCheckedIn &&
                guestsTurnedAway == that.guestsTurnedAway &&
                guestsDeparted == that.guestsDeparted &&
                roomsAvailable == that.roomsAvailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profit, guestsCheckedIn, guestsTurnedAway, guestsDeparted, roomsAvailable);
    }
}
