package sim;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel = new Hotel();

    @Test
    @Ignore("Delete this annotation when you're ready to run the test")
    public void canAcceptGuests() {
        hotel.setRooms(Collections.singletonList(new Room(0)));
        Collection<Guest> acceptedGuests = hotel.acceptGuests(Collections.singletonList(new Guest()));

        assertEquals(1, acceptedGuests.size());
    }
}