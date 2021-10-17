package in.co.ipl.webapp.DAO.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import in.co.ipl.webapp.DAO.PlayerDAO;
import in.co.ipl.webapp.dbaccess.imp.JDBCAccessImp;
import in.co.ipl.webapp.model.Player;

public class PlayerDAOImpl implements PlayerDAO {
	
	JDBCAccessImp jdbc = new JDBCAccessImp();
	Connection con = jdbc.getConnection();
	
	final String INSERTPLAYER = "insert into players ("
			+ "fname,lname,age,place,gender,role,isCaptain,isWicketKeeper,franchasie) "
			+ "values (?,?,?,?,?,?,?,?,?)";

	@Override
	public void addPlayer(Player player) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement ps = con.prepareStatement(INSERTPLAYER);
			ps.setString(1, player.getFirstName());
			ps.setString(2, player.getSecondName());
			ps.setInt(3, player.getAge());
			ps.setString(4, player.getPlace());

			ps.setString(5, player.getGender().toString());
			ps.setString(6, player.getPrimaryRole().toString());
			ps.setBoolean(7, player.isCaptain());
			ps.setBoolean(8, player.isWicketKeeper());
			ps.setString(9, player.getFrachaise().toString());
			int n = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updatePlayer(Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePlayer(Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public Player getPlayer(String fname, String lname, String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getPlayerByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeam(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getBowlersByTeam(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getBatsmanByTeam(String team) {
		// TODO Auto-generated method stub
		return null;
	}

}
