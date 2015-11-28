package main;
import javax.swing.*;
import java.sql.*;
public class Moat_Main {

	public static void main(String[] args) {
		/*JFrame jfr1 = new JFrame();
		JPanel jp1 = new JPanel_Home();
		jfr1.setSize(600, 600);
		jfr1.add(jp1);
		jfr1.setLocationRelativeTo(null);
		jfr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfr1.setVisible(true);
		GUI_Mediator gm1 = new GUI_Mediator();*/
		//gm1.destroy_in_Frame(jfr1);
		System.out.println(System.currentTimeMillis());
		JFrame jfr1 = new JFrame();
		JPanel jp1 = new JPanelUserForm();
		jfr1.add(jp1);
		jfr1.setSize(500, 500);
		jfr1.setLocationRelativeTo(null);
		jfr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfr1.setVisible(true);
	}

}
