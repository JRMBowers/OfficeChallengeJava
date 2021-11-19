package officeChallenge;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class OfficeTest {
    MeetingRoom room = new MeetingRoom("Room1");
    Office office = new Office();
    @Test
    public void testAddMeetingRoom(){
        office.addMeetingRoom(room);
        assertTrue(office.rooms instanceof ArrayList<MeetingRoom>);
    }
    @Test
    public void testGetMeetingRooms(){
        office.addMeetingRoom(room);
        assertEquals(office.getMeetingRooms().get(0), room.roomName );
    }
    @Test
    public void testGetAvailableMeetingRooms(){
        office.addMeetingRoom(room);
        MeetingRoom room2 = new MeetingRoom("Room2");
        office.addMeetingRoom(room2);
        ArrayList<String> checker = new ArrayList<>();
        checker.add("Room1");
        checker.add("Room2");
        assertEquals(checker, office.getAvailableMeetingRooms());
    }
}
