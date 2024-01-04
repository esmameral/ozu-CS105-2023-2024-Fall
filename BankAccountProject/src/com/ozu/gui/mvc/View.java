package com.ozu.gui.mvc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class View extends JFrame{
	// Panel fields
		JPanel formPanel;
		JPanel buttonPanel;
		JPanel trxPanel;
		JScrollPane pane;
		// Form Panel fields
		JLabel nameLabel = new JLabel("Name");
		JLabel messageLabel = new JLabel("");
		JLabel accountNumberLabel = new JLabel("Account Number");
		JLabel balanceLabel = new JLabel("Current Balance");
		JLabel trxTypeLabel = new JLabel("Transaction Type");
		JLabel trxAmountLabel = new JLabel("Amount");
		JTextField nameField;
		JTextField accountNumberField;
		JTextField balanceField;
		JTextField amountField;
		JComboBox<String> trxComboBox;
		Dimension fieldDimension = new Dimension(200, 300);
		
		//Button
		JButton postButton=new JButton("Post");
		JButton trxListButton=new JButton("Transactions");
	public View(String title) {

		setTitle(title);
		setBounds(100, 50, 400, 550);
		getContentPane().setLayout(null);
		// Form Panel Definition
		formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
		formPanel.setBounds(50, 50, 300, 200);
		formPanel.setBackground(new Color(255, 100, 150));
		

		nameField = new JTextField();
		
		nameField.setSize(fieldDimension);
		nameField.setEditable(false);
		accountNumberField = new JTextField();
		accountNumberField.setText("");
		
		accountNumberField.setSize(fieldDimension);
		accountNumberField.setEditable(false);
		amountField = new JTextField();
		amountField.setSize(fieldDimension);
		// Add components to panel
		formPanel.add(nameLabel);
		formPanel.add(nameField);

		formPanel.add(accountNumberLabel);
		formPanel.add(accountNumberField);
		formPanel.add(trxTypeLabel);
		String[] trxTypes= {"Withdraw","Deposit","Salary Payment"};
		trxComboBox=new JComboBox<String>(trxTypes);
		
		formPanel.add(trxComboBox);
		formPanel.add(trxAmountLabel);
		formPanel.add(amountField);
		
		balanceField=new JTextField("");
		balanceField.setSize(fieldDimension);
		balanceField.setEditable(false);
		formPanel.add(balanceLabel);
		formPanel.add(balanceField);
		getContentPane().add(formPanel);

		// Button Panel Definition
		buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setBounds(50, 270, 300, 50);
		buttonPanel.setBackground(Color.CYAN);
		
		
		
		buttonPanel.add(postButton);
		
		
		buttonPanel.add(trxListButton);
		
		getContentPane().add(buttonPanel);
		//Message Label 
		messageLabel.setBounds(50, 320, 300, 50);
		messageLabel.setText("Please select transaction type");
		messageLabel.setForeground(Color.red);
		getContentPane().add(messageLabel);
		
		// Transaction List Panel Definition
		trxPanel = new JPanel();
		trxPanel.setBounds(50, 360, 300, 100);
		trxPanel.setBackground(Color.ORANGE);
		trxPanel.add(new JLabel("FORM PANEL"));

		//getContentPane().add(trxPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	
		
	}

}
