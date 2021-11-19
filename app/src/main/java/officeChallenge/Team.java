package officeChallenge;

public class Team {
    String teamName;
    String teamMeeting;
    public Team(String team, String meeting){
        teamName = team;
        teamMeeting = meeting;
    }

    public String getTeam(){
        return teamName;
    }

    public String getMeeting(){
        return teamMeeting;
    }
}
