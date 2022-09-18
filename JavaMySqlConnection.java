package cop2805c;
import java.sql.*;

public class Homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection;
		try {
			ResultSet results = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
					"root","cop2805");
			//TODO: Run a select statement and print out the ResultSet
			System.out.print("HI");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
