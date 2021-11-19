package officeChallenge;

import java.util.ArrayList;

public class Office {
    ArrayList<MeetingRoom> rooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom room){
        rooms.add(room);
    }

    public ArrayList<String> getMeetingRooms(){
        ArrayList<String> roomNames = new ArrayList<>();
        for(MeetingRoom item : rooms){
            roomNames.add(item.roomName);
        }
        return roomNames;
    }

    public ArrayList<String> getAvailableMeetingRooms(){
        ArrayList<String> roomNames = new ArrayList<>();
        for(MeetingRoom item :rooms){
            if (item.availability == true) {
                roomNames.add(item.roomName);
            }
        }
        return roomNames;
    }
}
