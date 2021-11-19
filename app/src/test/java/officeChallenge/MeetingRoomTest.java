package officeChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeetingRoomTest {
    @Test
    public void testMeetingRoomGet(){
        MeetingRoom room = new MeetingRoom("Room 1");
        assertEquals(room.roomName, "Room 1");

    }
}
