package com.ozu.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PostButtonActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton o=(JButton)e.getSource();
		System.out.println(o.getText());
		
		System.out.println("User pressed Post button ");

	}

}
