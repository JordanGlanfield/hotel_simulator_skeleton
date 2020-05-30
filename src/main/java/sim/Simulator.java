package sim;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Simulator {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        List<Room> rooms = generateRooms(10);
        hotel.setRooms(rooms);

        int numSimulations = 10;

        for (int i = 0; i < numSimulations; i++) {
            List<Guest> newGuests = generateGuests(3, 6);
            BusinessSummary summary = hotel.simulate(newGuests);

            System.out.println(summary);
        }
    }

    private static List<Room> generateRooms(int numRooms) {
        List<Room> rooms = new ArrayList<>(10);

        for (int i = 0; i < numRooms; i++) {
            rooms.add(new Room(i));
        }

        return rooms;
    }

    private static List<Guest> generateGuests(int minGuests, int maxGuests) {
        List<Guest> guests = new ArrayList<>();

        for (int i = 0; i < ThreadLocalRandom.current().nextInt(minGuests, maxGuests + 1); i++) {
            // TODO: if you add properties to the guests, make sure to initialise them here.
            guests.add(new Guest());
        }

        return guests;
    }
}
