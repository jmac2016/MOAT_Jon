package main;
import java.sql.*;
public class SubmitUserBaseInfo {
	private String textFirstName, textLastName, textStreetAddress, textCity, textState, textPhoneNumber = "";
	private Integer textZip = 0;
	public SubmitUserBaseInfo(String textFirstName, String textLastName, String textStreetAddress,
			String textCity, String textState, String textZip, String textPhoneNumber){
		this.textFirstName = textFirstName;
		this.textLastName = textLastName;
		this.textStreetAddress = textStreetAddress;
		this.textCity = textCity;
		this.textState = textState;
		this.textZip = Integer.parseInt(textZip);
		this.textPhoneNumber = textPhoneNumber;
	}
	
	public Integer submit_to_database(){
		Connection c1 = new Connection();
		Statement st1;
		Integer temp;
		String sql = "INSERT INTO user_info(first_name, last_name, street_address, city, "
				+ "state, zip, phone_number) VALUES(" + "'" + textFirstName + "'" + ", " + 
				"'" + textLastName + "'" + ", " + "'" + textStreetAddress + "'" + ", " +
				"'" + textCity + "'" + ", " + "'" + textState + "'" + ", " + textZip +
				", " + "'" + textPhoneNumber + "'" + ")";
		try{
			st1 = c1.db.createStatement();
			temp = st1.executeUpdate(sql);
			return temp;
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		
		return 0;
	}
}
