package com.ozu.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.ozu.model.BankAccount;
import com.ozu.model.DepositTransaction;
import com.ozu.model.WithdrawalTransaction;

/**
 * amountField = new JTextField(); amountField.setSize(fieldDimension);
 */
public class BankApplication extends JFrame {
	BankAccount account=new BankAccount(67891, "Berkecan Kayacan");
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

	public BankApplication() {
		setTitle("Banking Application");
		setBounds(100, 50, 400, 550);
		getContentPane().setLayout(null);
		// Form Panel Definition
		formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
		formPanel.setBounds(50, 50, 300, 200);
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
		
		balanceField=new JTextField(account.getBalance()+"");
		balanceField.setSize(fieldDimension);
		balanceField.setEditable(false);
		formPanel.add(balanceLabel);
		formPanel.add(balanceField);
		

		getContentPane().add(formPanel);

		// Button Panel Definition
		buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setBounds(50, 270, 300, 50);
		buttonPanel.setBackground(Color.CYAN);
		postButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("post button");
				double amount=Double.parseDouble(amountField.getText());
				String trxType=(String)trxComboBox.getSelectedItem();
				if(trxType.equals("Withdraw")) {
					WithdrawalTransaction trx=new WithdrawalTransaction(amount);
					try {
						account.post(trx);
						balanceField.setText(account.getBalance()+"");
					} catch (Exception e1) {
						messageLabel.setText(e1.getMessage());
					}
				}else if(trxType.equals("Deposit")) {
					DepositTransaction trx=new DepositTransaction(amount);
					try {
						account.post(trx);
						balanceField.setText(account.getBalance()+"");
					} catch (Exception e1) {
						System.out.println(e1.getMessage());
						
					}
					
				}else {
					//Bill Payment
				}
				amountField.setText("");
						
			}
		});
		
		
		buttonPanel.add(postButton);
		
		trxListButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 //headers for the table
		        String[] columns = new String[] {
		            "Id", "Name", "Hourly Rate", "Part Time"
		        };
		         
		        //actual data for the table in a 2d array
		        Object[][] data = new Object[][] {
		            {1, "John", 40.0, false },
		            {2, "Rambo", 70.0, false },
		            {3, "Zorro", 60.0, true },
		            {3, "Zorro", 60.0, true },
		            {3, "Zorro", 60.0, true },
		            {3, "Zorro", 60.0, true },
		        };
		        //create table with data
		        
		        JTable table = new JTable(data, columns);
		        pane=new JScrollPane(table) ;
		        pane.setBounds(50, 370, 300, 100);
		        //add the table to the frame
		        
		        //add(pane);
		        getContentPane().add(pane);
				
			}
		});
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

	public static void main(String[] args) {
		new BankApplication();

	}

	

}
