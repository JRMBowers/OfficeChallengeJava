package officeChallenge;

public class MeetingRoom {
    String roomName ;
    boolean availability;

    public MeetingRoom(String room){
        availability = true;
        roomName = room;
    }

    public boolean getMeetingRoomAvailability(){
        return availability;
    }
}
