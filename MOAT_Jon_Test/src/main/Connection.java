package main;
import java.sql.*;
public class Connection {
	
	/*String url = "jdbc:postgresql://ec2-107-21-219-235.compute-1.amazonaws.com:5432/d7bu4r9d5gk5eu?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
	String username = "fsndpoavljhuuw";
	String password = "cdWEW7xBetm8NWKEp6qEKR1VGA";*/
	
	String url = "localhost";
	String username = "root";
	String password = "";
	java.sql.Connection db = null;
	public Connection(){
		try {
			db = DriverManager.getConnection("jdbc:mysql://localhost:3306/auction_project", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
}
