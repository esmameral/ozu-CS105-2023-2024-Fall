package com.ozu.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.ozu.model.BankAccount;

/**
 * amountField = new JTextField(); amountField.setSize(fieldDimension);
 */
public class BankApplication extends JFrame {
	BankAccount account=new BankAccount(67891, "Berkecan Kayacan");
	// Panel fields
	JPanel formPanel;
	JPanel buttonPanel;
	JPanel trxPanel;
	// Form Panel fields
	JLabel nameLabel = new JLabel("Name");
	JLabel accountNumberLabel = new JLabel("Account Number");
	JLabel trxTypeLabel = new JLabel("Transaction Type");
	JLabel trxAmountLabel = new JLabel("Amount");
	JTextField nameField;
	JTextField accountNumberField;
	JTextField amountField;
	JComboBox<String> trxComboBox;
	Dimension fieldDimension = new Dimension(200, 300);
	
	//Button
	JButton postButton=new JButton("Post");
	JButton trxListButton=new JButton("Transactions");

	public BankApplication() {
		setTitle("Banking Application");
		setBounds(100, 50, 400, 450);
		setLayout(null);
		// Form Panel Definition
		formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
		formPanel.setBounds(50, 50, 300, 150);
		formPanel.setBackground(new Color(255, 100, 150));
		

		nameField = new JTextField(account.getOwnerName());
		nameField.setSize(fieldDimension);
		nameField.setEditable(false);
		accountNumberField = new JTextField();
		accountNumberField.setText(account.getAccountNumber()+"");
		
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
		String[] trxTypes= {"Withdraw","Deposit","Bill Payment"};
		trxComboBox=new JComboBox<String>(trxTypes);
		
		formPanel.add(trxComboBox);
		formPanel.add(trxAmountLabel);
		formPanel.add(amountField);

		add(formPanel);

		// Button Panel Definition
		buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setBounds(50, 210, 300, 50);
		buttonPanel.setBackground(Color.CYAN);
		postButton.addActionListener(new PostButtonActionListener());
		buttonPanel.add(postButton);
		
		trxListButton.addActionListener(new TrxListButtonActionListener());
		buttonPanel.add(trxListButton);
		
		add(buttonPanel);

		// Transaction List Panel Definition
		trxPanel = new JPanel();
		trxPanel.setBounds(50, 270, 300, 100);
		trxPanel.setBackground(Color.ORANGE);
		trxPanel.add(new JLabel("FORM PANEL"));

		add(trxPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new BankApplication();

	}

}
