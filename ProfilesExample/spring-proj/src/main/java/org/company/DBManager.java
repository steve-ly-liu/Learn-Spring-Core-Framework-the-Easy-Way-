package org.company;

import java.sql.SQLException;

import javax.sql.DataSource;

public class DBManager {

	private DataSource dataSource;

	public DBManager() {

	}

	public DBManager(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void connectToDB() {
		try {
			dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
