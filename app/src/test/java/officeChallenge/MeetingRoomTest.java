package officeChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

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
    @Test
    public void testEnterMeetingRoom(){
        room.enterMeetingRoom();
        assertFalse(room.getMeetingRoomAvailability());
    }
    @Test
    public void testLeaveMeetingRoom(){
        room.leaveMeetingRoom();
        assertTrue(room.getMeetingRoomAvailability());
    }
}
