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

public class JPanelUserForm extends JPanel {
	private JTextField textUsername;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textStreetAddress;
	private JTextField textCity;
	private JTextField textState;
	private JTextField textZip;
	private JTextField textPhoneNumber;

	/**
	 * Create the panel.
	 */
	public JPanelUserForm() {
		
		JLabel lblEnterYourInformation = new JLabel("Enter Your Information Here");
		
		JLabel lblUsername = new JLabel("Username");
		
		textUsername = new JTextField();
		textUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoBackToHome(e);
			}
		});
		
		JLabel lblFirstName = new JLabel("First Name");
		
		textFirstName = new JTextField();
		textFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		
		textLastName = new JTextField();
		textLastName.setColumns(10);
		
		JLabel lblStreetAddress = new JLabel("Street Address");
		
		textStreetAddress = new JTextField();
		textStreetAddress.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		
		textCity = new JTextField();
		textCity.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		
		textState = new JTextField();
		textState.setColumns(10);
		
		JLabel lblZip = new JLabel("Zip");
		
		textZip = new JTextField();
		textZip.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		
		textPhoneNumber = new JTextField();
		textPhoneNumber.setColumns(10);
		
		JButton btnSubmitAndContinue = new JButton("Submit and Continue");
		btnSubmitAndContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SubmitAndContinue(arg0);
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(221, Short.MAX_VALUE)
					.addComponent(lblEnterYourInformation)
					.addGap(93))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(302, Short.MAX_VALUE)
					.addComponent(lblUsername)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(304, Short.MAX_VALUE)
					.addComponent(lblPassword)
					.addGap(100))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLastName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(300, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStreetAddress)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textStreetAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(278, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCity)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(325, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblState)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textState, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(324, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblZip)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textZip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(330, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblFirstName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblPhoneNumber))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(164)
							.addComponent(btnGoBack)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSubmitAndContinue))
					.addContainerGap(120, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnterYourInformation)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName)
						.addComponent(textFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPhoneNumber)
						.addComponent(textPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName)
						.addComponent(textLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStreetAddress)
						.addComponent(textStreetAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCity)
						.addComponent(textCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblState)
						.addComponent(textState, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblZip)
						.addComponent(textZip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnGoBack)
								.addComponent(btnSubmitAndContinue))
							.addGap(36))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsername))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPassword)
							.addGap(63)))
					.addGap(36))
		);
		setLayout(groupLayout);

	}
	public void GoBackToHome(ActionEvent arg0){
		JPanel jp1 = new JPanel_Home();
		JPanel jptemp = (JPanel) this.getParent();
		jptemp.setVisible(false);
		jptemp.removeAll();
		jptemp.add(jp1);
		jptemp.setVisible(true);
	}
	public void SubmitAndContinue(ActionEvent arg0){
		JPanel jp1 = new JPanelUserFormPage2();
		JPanel jptemp = (JPanel) this.getParent();
		jptemp.setVisible(false);
		jptemp.removeAll();
		jptemp.add(jp1);
		jptemp.setVisible(true);
	}
}
