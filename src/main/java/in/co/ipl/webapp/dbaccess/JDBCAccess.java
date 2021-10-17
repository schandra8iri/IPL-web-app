package in.co.ipl.webapp.dbaccess;

import java.sql.Connection;

import in.co.ipl.webapp.dbaccess.DataBaseAccess;

public interface JDBCAccess extends DataBaseAccess{

	Connection getConnection();
	void createDBSchema();
	void destroyDBSchema();
}
