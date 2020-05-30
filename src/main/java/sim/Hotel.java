package sim;

import java.util.*;

public class Hotel {

    public void setRooms(List<Room> rooms) {
    }

    // Returns the guests that were accepted. Guests may be rejected if the hotel does not match their preferences.
    List<Guest> acceptGuests(List<Guest> newGuests) {
        // TODO: attempt to assign guests to rooms.
        return new ArrayList<>();
    }

    public BusinessSummary simulate(List<Guest> newGuests) {
        int departures = simulateDepartures();
        List<Guest> acceptedGuests = acceptGuests(newGuests);

        // TODO: compute earnings and available rooms.
        return new BusinessSummary(0,
                acceptedGuests.size(),
                newGuests.size() - acceptedGuests.size(),
                departures,
                0);
    }

    private int simulateDepartures() {
        // TODO: simulate guest departures. E.g, guests have a random chance of leaving, or a desired length of stay.
        return 0;
    }
}
