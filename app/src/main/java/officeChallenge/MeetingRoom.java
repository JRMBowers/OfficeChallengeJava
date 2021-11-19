package officeChallenge;

public class MeetingRoom {
    String roomName ;
    String teamMeeting;
    String teamInMeeting;
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

    public void enterMeetingRoom(Team team) {
        if (availability == false) {
            System.out.printf("Room already occupied by %s for %s \n", teamInMeeting, teamMeeting);
            throw new RuntimeException("Room already occupied");
        }
        teamInMeeting = team.getTeam();
        teamMeeting = team.getMeeting();
        availability = false;
    }

    private void sendMessage(String room){
        // SendSMS sms = new SendSMS();
        // sms.roomReadySendSms(room);
    }

    public void leaveMeetingRoom(){
        availability = true;
        sendMessage(getRoomName());
    }
}
