package main;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class JPanel_Home extends JPanel {
	/**
	 * Create the panel.
	 */
	public JPanel_Home() {
		JLabel lblWelcomeToOur = new JLabel("Welcome to Our Service");
		JButton btnSignUpHere = new JButton("Sign Up Here");
		btnSignUpHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				destroyAllElements(arg0);
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(249, Short.MAX_VALUE)
					.addComponent(lblWelcomeToOur)
					.addGap(155))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addComponent(btnSignUpHere)
					.addContainerGap(324, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(lblWelcomeToOur)
					.addGap(29)
					.addComponent(btnSignUpHere)
					.addContainerGap(212, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	public void destroyAllElements(ActionEvent arg0){
		JPanel jpu1 = new JPanelUserForm();
		JPanel jptemp = (JPanel) this.getParent();
		jptemp.setVisible(false);
		jptemp.removeAll();
		jptemp.add(jpu1);
		jptemp.setVisible(true);
	}
}
