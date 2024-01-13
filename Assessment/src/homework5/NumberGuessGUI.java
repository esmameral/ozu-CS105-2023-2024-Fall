package homework5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * amountField = new JTextField(); amountField.setSize(fieldDimension);
 */
public class NumberGuessGUI extends JFrame {
	// Panel fields

	Dimension fieldDimension = new Dimension(200, 300);
	JButton startButton = new JButton("Start Game");
	JButton checkButton = new JButton("Check");
	JLabel guessLabel = new JLabel("Your Guess");
	JTextField guess;
	JTextArea messageArea;
	int randomNumber = 0;
	boolean isGameLevelSelected = false;
	boolean isGameStarted = false;
	int guessCount;
	ArrayList<Integer> guessList = new ArrayList<Integer>();
	JTable table = new JTable();
	JScrollPane scrollPane;
	JRadioButton r1 = new JRadioButton("Easy");
	JRadioButton r2 = new JRadioButton("Medium");
	JRadioButton r3 = new JRadioButton("Hard");

	public NumberGuessGUI() {
		setTitle("Number Guessing Game");
		setBounds(100, 50, 460, 450);
		getContentPane().setLayout(null);
		table.setVisible(false);

		r1.setBounds(60, 50, 80, 30);
		r1.addActionListener(new RadioButtonActionListener());
		r2.setBounds(160, 50, 80, 30);
		r2.addActionListener(new RadioButtonActionListener());
		r3.setBounds(260, 50, 80, 30);
		r3.addActionListener(new RadioButtonActionListener());
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		getContentPane().add(r1);
		getContentPane().add(r2);
		getContentPane().add(r3);
		startButton.setBackground(Color.RED);
		startButton.setBounds(116, 87, 174, 30);
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				isGameLevelSelected = true;
				table.setVisible(rootPaneCheckingEnabled);
				isGameStarted = true;
				if (r1.isSelected())
					randomNumber = (int) (Math.random() * 50) + 1;
				else if (r2.isSelected())
					randomNumber = (int) (Math.random() * 100) + 1;
				else if (r3.isSelected())
					randomNumber = (int) (Math.random() * 200) + 1;
				else {
					messageArea.setText("Please select game level !!");
					isGameLevelSelected = false;
					isGameStarted = false;
					return;
				}
				System.out.println(randomNumber);
				if (scrollPane != null) {
					getContentPane().remove(scrollPane);
					revalidate();
					repaint();
					messageArea.setText("");
				}

				startButton.setText("Game started");
				startButton.setBackground(Color.GREEN);

			}
		});
		getContentPane().add(startButton);
		guessLabel.setBounds(23, 128, 107, 30);
		getContentPane().add(guessLabel);
		guess = new JTextField();
		guess.setBounds(116, 128, 50, 30);
		getContentPane().add(guess);

		checkButton.setBackground(new Color(0, 255, 255));
		checkButton.setBounds(186, 128, 104, 30);
		checkButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!isGameStarted) {
					messageArea.setText("Please start GAME first!!");
					return;
				}
				if (!isGameLevelSelected) {
					messageArea.setText("Please select GAME LEVEL first!!");
					return;
				}
				if (guess.getText() == null || guess.getText().length() == 0) {
					messageArea.setText("Please enter your guess!!");
					return;

				}

				int guessNumber = Integer.valueOf(guess.getText());
				guessList.add(guessNumber);
				guessCount++;
				if (guessNumber > randomNumber)
					messageArea.setText("Your guess is wrong!! Guess a LOWER number.");
				else if (guessNumber < randomNumber)
					messageArea.setText("Your guess is wrong!! Guess a HIGHER number.");
				else if (guessNumber == randomNumber) {
					messageArea.setText("CONGRATULATIONS!!! You guessed the number in " + guessCount + " tries");
					startButton.setText("Start Game");
					startButton.setBackground(Color.RED);
					isGameStarted = false;

					guess.setText("");
					prepareJTable();

				}

			}
		});
		getContentPane().add(checkButton);

		messageArea = new JTextArea(5, 30);
		messageArea.setEditable(false);
		messageArea.setBounds(23, 169, 400, 41);
		messageArea.setBackground(Color.PINK);
		messageArea.setFont(new Font("Courier", Font.PLAIN, 14));
		messageArea.setLineWrap(true);
		getContentPane().add(messageArea);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	class RadioButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String text;
			String range;
			if (r1.isSelected()) {
				text = r1.getText();
				range = "[1-50]";
			} else if (r2.isSelected()) {
				text = r2.getText();
				range = "[1-100]";
			} else {
				text = r3.getText();
				range = "[1-200]";
			}

			messageArea.setText("You selected " + text + " level. Please enter a number in the range " + range);
			isGameLevelSelected = true;

		}

	}

	public static void main(String[] args) {
		new NumberGuessGUI();

	}

	private void prepareJTable() {

// Column Names
		String[] columnNames = { "#", "Guess" };
		Integer[][] data = new Integer[guessCount][2];
		for (int i = 0; i < guessCount; i++) {
			data[i][0] = i + 1;
			data[i][1] = guessList.get(i);

		}

		table = new JTable(data, columnNames);
		scrollPane = new JScrollPane(table);
		scrollPane.setSize(100, 160);

		scrollPane.setLocation(116, 221);

		getContentPane().add(scrollPane);
	}
}
