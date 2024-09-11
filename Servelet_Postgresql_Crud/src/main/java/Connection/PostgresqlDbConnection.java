package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlDbConnection {
	private static final String url = "jdbc:postgresql://localhost:5432/Mercado";
	private static final String username = "postgres";
	private static final String password = "password";
	
	public static Connection CreateConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("-- driver found");
		} catch (Exception e) {
			System.out.println("-- driver not found " + e.getMessage());
		}
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to database");
			return connection;
		} catch (SQLException e) {
			System.out.println("-- incorrect connection " + e.getMessage());
			return null;
		}
	}
}