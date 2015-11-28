package main;
import java.sql.*;
public class Submit_Credit_Info {
	Float textCardNumber = null;
	Integer textCCVNumber = 0;
	String textExpDate, textFullNameOnCard, textFirstName, textLastName = "";
	public Submit_Credit_Info(String textCardNumber, String textCCVNumber, String textExpDate,
			String textFullNameOnCard, String textFirstName, String textLastName){
		this.textCardNumber = Float.parseFloat(textCardNumber);
		this.textCCVNumber = Integer.parseInt(textCCVNumber);
		this.textExpDate = textExpDate;
		this.textFullNameOnCard = textFullNameOnCard;
		this.textFirstName = textFirstName;
		this.textLastName = textLastName;
	}
	
	public Integer Sumbit_Credit_To_Database(){
		String sql = "INSERT INTO user_credit (card_number, ccv_number, exp_date, full_name_on_card, " +
				"first_name, last_name) VALUES(" + textCardNumber + ", " + textCCVNumber + ", " +
				"'" + textExpDate + "'" + ", " + "'" + textFullNameOnCard + "'" + ", " +
				"'" + textFirstName + "'" + ", " + "'" + textLastName + "'" + ")"; 
		Connection c1 = new Connection();
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
