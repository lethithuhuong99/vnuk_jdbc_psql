package vn.edu.vnuk.jdbc.psql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		
		try {
		return DriverManager.getConnection(
			"jdbc:postgresql://localhost/vnuk_personnel",
			"ThuHuong",
			"Toi La Huong"
		);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}