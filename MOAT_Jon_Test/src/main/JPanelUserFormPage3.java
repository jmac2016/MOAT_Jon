package main;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelUserFormPage3 extends JPanel {
	private JTextField textUsername;
	private JTextField textPassword;
	private String textFirstName = "";
	private String textLastName = "";
	/**
	 * Create the panel.
	 */
	public JPanelUserFormPage3(String textFirstName, String textLastName) {
		this.textFirstName = textFirstName;
		this.textLastName = textLastName;
		
		
		JLabel lblChooseUsernameAnd = new JLabel("Choose Username and Password");
		
		JLabel lblUsername = new JLabel("Username");
		
		textUsername = new JTextField();
		textUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		
		JButton btnSubmitAndGo = new JButton("Submit And Go Back ");
		btnSubmitAndGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				submitAndGoBack(textUsername.toString(), textPassword.toString(), textFirstName, textLastName);
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPassword)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblUsername)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(296, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(260, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnSubmitAndGo)
						.addComponent(lblChooseUsernameAnd))
					.addGap(144))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblChooseUsernameAnd)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword)
						.addComponent(textPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(152)
					.addComponent(btnSubmitAndGo)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}
	
	public void submitAndGoBack(String textUsername, String textPassword, String textFirstName,
			String textLastName){
		SubmitUsernameAndPassword sup1 = new SubmitUsernameAndPassword(textUsername, textPassword, 
				textFirstName, textLastName);
		System.out.println(sup1.submit_credentials_to_db());
		JPanel jp1 = (JPanel) this.getParent();
		jp1.setVisible(false);
		jp1.removeAll();
		JPanel jptemp = new JPanel_Home();
		jp1.add(jptemp);
		jp1.setVisible(true);
	}

}
