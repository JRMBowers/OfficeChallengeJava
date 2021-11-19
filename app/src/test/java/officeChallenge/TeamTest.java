package officeChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {
    Team team = new Team("Makers","Learning Java");
    @Test
    public void testGetTeam(){
        assertEquals(team.getTeam(), "Makers");
    }
    @Test
    public void testGetMeeting(){
        assertEquals(team.getMeeting(), "Learning Java");
    }
}
