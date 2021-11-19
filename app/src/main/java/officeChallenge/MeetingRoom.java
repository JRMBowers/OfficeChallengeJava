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

    public String getRoomName(){
        return roomName;
    }

    public void enterMeetingRoom(){
        if(availability == false) {
            System.out.printf("Room already occupied");
            throw new RuntimeException("Room already occupied");
        }
        availability = false;
    }

    public void leaveMeetingRoom(){
        availability = true;
    }
}
