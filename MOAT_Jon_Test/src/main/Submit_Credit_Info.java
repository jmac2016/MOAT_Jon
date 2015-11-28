package main;
import java.sql.*;
public class Submit_Credit_Info {
	Float textCardNumber = null;
	Integer textCCVNumber = 0;
	String textExpDate, textFullNameOnCard = "";
	public Submit_Credit_Info(String textCardNumber, String textCCVNumber, String textExpDate,
			String textFullNameOnCard){
		this.textCardNumber = Float.parseFloat(textCardNumber);
		this.textCCVNumber = Integer.parseInt(textCCVNumber);
		this.textExpDate = textExpDate;
		this.textFullNameOnCard = textFullNameOnCard;
		
	}
}
