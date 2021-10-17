package in.co.ipl.webapp.dbaccess.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import in.co.ipl.webapp.dbaccess.JDBCAccess;


public class JDBCAccessImp implements JDBCAccess {
	
	
	private static Connection conn = null;
	private static String URL = "jdbc:mysql:// localhost:3306/IPLDB";
	private static String User = "root";
	private static String pwd = "root";
	

	public JDBCAccessImp() {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL,User,pwd);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return conn;
	}
	
	

	@Override
	public void createDBSchema() {
		/*// TODO Auto-generated method stub
		 * https://mkyong.com/jdbc/how-to-run-a-mysql-script-using-java/
		try {
			// Initialize object for ScripRunner
			ScriptRunner sr = new ScriptRunner(conn,false,false);

			// Give the input file to Reader
			Reader reader = new BufferedReader(
                               new FileReader(aSQLScriptFilePath));

			// Exctute script
			sr.runScript(reader);

		} catch (Exception e) {
			System.err.println("Failed to Execute" + aSQLScriptFilePath
					+ " The error is " + e.getMessage());
		}
	}*/
	}

	@Override
	public void destroyDBSchema() {
		// TODO Auto-generated method stub
		
	}
	
	

}
