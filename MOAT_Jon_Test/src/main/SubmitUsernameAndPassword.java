package main;
import java.sql.*;
public class SubmitUsernameAndPassword {
	private String textUsername, textPassword, textFirstName, textLastName = "";
	
	public SubmitUsernameAndPassword(String textUsername, String textPassword, String textFirstName,
			String textLastName){
		this.textUsername = textUsername;
		this.textPassword = textPassword;
		this.textFirstName = textFirstName;
		this.textLastName = textLastName;
	}
	
	public Integer submit_credentials_to_db(){
		
		Connection c1 = new Connection();
		
		String sql = "INSERT INTO user_credentials(username, password, first_name, last_name) " +
		"VALUES(" + "'" + textUsername + "'" + ", " + "'" + textPassword + "'" + ", " + 
		"'" + textFirstName + "'" + ", " + "'" + textLastName + "'" + ")";
		
		Statement st1 = null;
		
		try{
			st1 = c1.db.createStatement();
			return st1.executeUpdate(sql);
			
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		return 0;
	}
}
