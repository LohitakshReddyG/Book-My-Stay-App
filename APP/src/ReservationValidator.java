import java.util.*;

public class ReservationValidator {

    public void validate(
            String guestName,
            String roomType,
            RoomInventory inventory
    ) throws InvalidBookingException {

        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        List<String> validRoomTypes = Arrays.asList("Single", "Double", "Suite");
        if (!validRoomTypes.contains(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        int availability = inventory.getRoomAvailability().getOrDefault(roomType, 0);
        if (availability <= 0) {
            throw new InvalidBookingException("No rooms available for " + roomType);
        }
    }
}