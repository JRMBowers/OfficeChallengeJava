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
            roomNames.add(item.getRoomName());
        }
        return roomNames;
    }

    public ArrayList<String> getAvailableMeetingRooms(){
        ArrayList<String> roomNames = new ArrayList<>();
        for(MeetingRoom item :rooms){
            if (item.getMeetingRoomAvailability() == true) {
                roomNames.add(item.getRoomName());
            }
        }
        return roomNames;
    }

}
