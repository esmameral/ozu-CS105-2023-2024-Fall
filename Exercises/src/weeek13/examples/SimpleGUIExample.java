package weeek13.examples;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGUIExample {

	public static void main(String[] args) {
		JFrame f = new JFrame("Simple Frame Example");
		f.setSize(300, 400);
		f.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(40, 80, 300, 400);
		panel.setBackground(Color.gray);

		JButton button = new JButton("First Button");
		button.setBounds(5, 20, 150, 30);
		button.setBackground(Color.YELLOW);
		button.setForeground(Color.MAGENTA);

		panel.add(button);

		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
