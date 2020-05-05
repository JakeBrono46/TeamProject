import java.util.*;

public class Team {

	private ArrayList<Player> roster;
	
	public Team() {
		roster = new ArrayList<Player>();
	}
	
	public void addPlayer(Player name) {
		roster.add(name);
	}
	
	public String toString() {
		String teamRoster = "Team Roster\n\n";
		
		for(Player p : roster) {
			teamRoster = teamRoster + p.toString() + "\n";
		}
		return teamRoster;
	}
	
	public String toFile() {
		String fileRoster = "";
		
		for(Player p : roster) {
			fileRoster = fileRoster + p.toFile() + "\n";
		}
		
		return fileRoster;
	}

}
