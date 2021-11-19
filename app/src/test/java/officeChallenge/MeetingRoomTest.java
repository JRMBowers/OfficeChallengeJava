package officeChallenge;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MeetingRoomTest {
    MeetingRoom room = new MeetingRoom("Room 1");
    Team team = mock(Team.class);
    Team team2 = mock(Team.class);

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
        when(team.getTeam()).thenReturn("Marvel");
        when(team.getMeeting()).thenReturn("Taking Down Thanos");
        when(team2.getTeam()).thenReturn("Batman");
        when(team2.getMeeting()).thenReturn("Taking Down Joker");

        room.enterMeetingRoom(team);
        assertFalse(room.getMeetingRoomAvailability());
        assertThrows(RuntimeException.class,() -> room.enterMeetingRoom(team2));
    }
    @Test
    public void testLeaveMeetingRoom(){
        room.leaveMeetingRoom();
        assertTrue(room.getMeetingRoomAvailability());
    }
}
