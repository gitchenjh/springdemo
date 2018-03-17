package priv.chenjh.springdemo.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DAO {
	
	private static DAO instance = null;
	
	private static DataSource dataSource;
	
	public static synchronized DAO getInstance() {
		if (instance == null) {
			return new DAO();
		} else {
			return instance;
		}
	}

	public DataSource getDataSource() {
		return DAO.dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		DAO.dataSource = dataSource;
	}
	
	public static synchronized Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	
}
