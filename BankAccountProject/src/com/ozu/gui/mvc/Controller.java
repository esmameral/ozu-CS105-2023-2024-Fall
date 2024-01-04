package com.ozu.gui.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.ozu.model.DepositTransaction;
import com.ozu.model.SalaryPayment;
import com.ozu.model.Transaction;
import com.ozu.model.WithdrawalTransaction;
import com.ozu.model.util.DateUtil;

public class Controller {
	Model model;
	View view;

	public Controller(Model m, View v) {
		super();
		this.model = m;
		this.view = v;
	}

	public void initView() {
		view.nameField.setText(model.account.getOwnerName());
		view.accountNumberField.setText(model.account.getAccountNumber() + "");
		view.balanceField.setText(model.account.getBalance() + "");
	}

	public void defineHandlerMethods() {
		view.postButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.messageLabel.setText("");
				double amount = Double.parseDouble(view.amountField.getText());
				String trxType = (String) view.trxComboBox.getSelectedItem();
				Transaction trx;
				if (trxType.equals("Withdraw")) {
					trx = new WithdrawalTransaction(amount);
					
				} else if (trxType.equals("Deposit")) {
					trx = new DepositTransaction(amount);

				} else {
					trx = new SalaryPayment("Ozu Comp", 2023, 12, amount);
				}
				try {
					model.account.post(trx);
					view.balanceField.setText(model.account.getBalance() + "");
					view.messageLabel.setText("Transaction completed successfully");
				} catch (Exception e1) {
					view.messageLabel.setText(e1.getMessage());
				}
				view.amountField.setText("");

			}
		});

		view.trxListButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// headers for the table
				String[] columns = new String[] { "Date & Time", "Transaction Type", "Amount" };

				int size = model.account.getTransactions().size();

				// actual data for the table in a 2d array
				String[][] data = new String[size][3];
				for (int i = 0; i < model.account.getTransactions().size(); i++) {
					Transaction trx = model.account.getTransactions().get(i);
					data[i][0] = DateUtil.convertDateToString(trx.getDate());
					data[i][1] = trx.getClass().getSimpleName();
					data[i][2] = trx.getAmount() + "";

				}

				// create table with data

				JTable table = new JTable(data, columns);
				view.pane = new JScrollPane(table);
				view.pane.setBounds(50, 370, 300, 100);
				// add the table to the frame

				// add(pane);
				view.add(view.pane);

			}
		});

	}

}
