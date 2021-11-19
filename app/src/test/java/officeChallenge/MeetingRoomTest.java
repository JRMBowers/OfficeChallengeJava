package officeChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MeetingRoomTest {
    MeetingRoom room = new MeetingRoom("Room 1");
    @Test
    public void testMeetingRoomGet(){
        assertEquals(room.roomName, "Room 1");
    }
    @Test
    public void testMeetingRoomAvailable(){
        assertTrue(room.getMeetingRoomAvailability());
    }
}
