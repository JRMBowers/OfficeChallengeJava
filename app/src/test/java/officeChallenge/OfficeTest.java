package officeChallenge;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class OfficeTest {
    @Test
    public void testAddMeetingRoom(){
        MeetingRoom room = new MeetingRoom("Room1");
        Office office = new Office();
        office.addMeetingRoom(room);
        assertTrue(office.rooms instanceof ArrayList<MeetingRoom>);
    }
    @Test
    public void testGetMeetingRooms(){
        MeetingRoom room = new MeetingRoom("Room1");
        Office office = new Office();
        office.addMeetingRoom(room);
        assertEquals(office.getMeetingRooms().get(0), room.roomName );
    }
}
