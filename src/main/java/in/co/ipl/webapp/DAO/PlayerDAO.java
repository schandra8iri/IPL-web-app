package in.co.ipl.webapp.DAO;

import java.util.List;

import in.co.ipl.webapp.model.Player;

public interface PlayerDAO {

	void addPlayer(Player player);
	void updatePlayer(Player player);
	void deletePlayer(Player player);
	Player getPlayer(String fname, String lname, String team);
	Player getPlayerByID(int id);
	List<Player> getPlayersByTeam(String team);
	List<Player> getBowlersByTeam(String team);
	List<Player> getBatsmanByTeam(String team);

}
