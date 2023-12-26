package weeek13.examples;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutExample {

	public static void main(String[] args) {
		JFrame f = new JFrame("Simple Frame Example");
		f.setSize(500, 500);
		f.setLayout(null);
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.setBounds(40, 80, 300, 400);

		JButton button1 = new JButton("Button1");
		
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		JButton button5 = new JButton("Button5");
		JButton button6 = new JButton("Button6");
		JButton button7 = new JButton("Button7");
		button1.setSize(100, 20);
		button2.setSize(100, 20);
		button3.setSize(100, 20);
		button4.setSize(100, 20);
		button5.setSize(100, 20);
		button6.setSize(100, 20);
		button7.setSize(100, 20);
		

		

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
