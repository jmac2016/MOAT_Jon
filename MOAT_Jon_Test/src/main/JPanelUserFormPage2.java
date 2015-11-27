package main;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JPanelUserFormPage2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelUserFormPage2() {
		
		JLabel lblEnterPaymentInformation = new JLabel("Enter Payment Information");
		
		JLabel lblCardNumber = new JLabel("Card Number");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(173, Short.MAX_VALUE)
					.addComponent(lblEnterPaymentInformation)
					.addGap(147))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCardNumber)
					.addContainerGap(394, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblEnterPaymentInformation)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblCardNumber)
					.addContainerGap(261, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
