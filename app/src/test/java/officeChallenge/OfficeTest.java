package officeChallenge;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OfficeTest {
    MeetingRoom room = new MeetingRoom("Room1");
    MeetingRoom mockRoom = mock(MeetingRoom.class);
    MeetingRoom mockRoom2 = mock(MeetingRoom.class);
    Office office = new Office();
    @Test
    public void testAddMeetingRoom(){
        when(mockRoom.getRoomName()).thenReturn("Room1");
        office.addMeetingRoom(mockRoom);
        assertTrue(office.rooms instanceof ArrayList<MeetingRoom>);
    }
    @Test
    public void testGetMeetingRooms(){
        when(mockRoom.getRoomName()).thenReturn("Room1");
        office.addMeetingRoom(mockRoom);
        assertEquals(office.getMeetingRooms().get(0), mockRoom.getRoomName() );
    }
    @Test
    public void testGetAvailableMeetingRooms(){
        when(mockRoom.getRoomName()).thenReturn("Room1");
        when(mockRoom2.getRoomName()).thenReturn("Room2");
        when(mockRoom.getMeetingRoomAvailability()).thenReturn(true);
        when(mockRoom2.getMeetingRoomAvailability()).thenReturn(true);
        office.addMeetingRoom(mockRoom);
        MeetingRoom room2 = new MeetingRoom("Room2");
        office.addMeetingRoom(mockRoom2);
        ArrayList<String> checker = new ArrayList<>();
        checker.add("Room1");
        checker.add("Room2");
        assertEquals(checker, office.getAvailableMeetingRooms());
    }
}
