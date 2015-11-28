package main;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelUserFormPage2 extends JPanel {
	private JTextField textCardNumber;
	private JTextField textCCVNumber;
	private JTextField textExpDate;
	private JTextField textFullNameOnCard;

	/**
	 * Create the panel.
	 */
	public JPanelUserFormPage2() {
		
		JLabel lblEnterPaymentInformation = new JLabel("Enter Payment Information");
		
		JLabel lblCardNumber = new JLabel("Card Number");
		
		textCardNumber = new JTextField();
		textCardNumber.setColumns(10);
		
		JLabel lblCcvNumber = new JLabel("CCV Number");
		
		textCCVNumber = new JTextField();
		textCCVNumber.setColumns(10);
		
		JLabel lblExpDate = new JLabel("Exp Date");
		
		textExpDate = new JTextField();
		textExpDate.setColumns(10);
		
		JLabel lblFullnameoncard = new JLabel("Full_Name_On_Card");
		
		textFullNameOnCard = new JTextField();
		textFullNameOnCard.setColumns(10);
		
		JButton btnSubmitAndContinue = new JButton("Submit and Continue");
		btnSubmitAndContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				submitAndContinue();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCardNumber)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textCardNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(287, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCcvNumber)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textCCVNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(290, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblExpDate)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textExpDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(300, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblFullnameoncard)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textFullNameOnCard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(246, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(173, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnSubmitAndContinue)
						.addComponent(lblEnterPaymentInformation))
					.addGap(147))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblEnterPaymentInformation)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textCardNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCardNumber))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCcvNumber)
						.addComponent(textCCVNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblExpDate)
						.addComponent(textExpDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFullnameoncard)
						.addComponent(textFullNameOnCard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(101)
					.addComponent(btnSubmitAndContinue)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	public void submitAndContinue(){
		Submit_Credit_Info sc1 =  new Submit_Credit_Info(textCardNumber.getText(), 
				textCCVNumber.getText(), textExpDate.getText(),
				textFullNameOnCard.getText());
	}

}
