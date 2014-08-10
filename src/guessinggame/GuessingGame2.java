package guessinggame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class GuessingGame2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	public int randomNo	= new Random().nextInt(10)+1;
	public int guesses 	= 0;
	
	JButton jButton		= new JButton("Guess");
	JLabel jLabel			= new JLabel( guesses +  " Guesses");
	JTextField jTextfield	= new JTextField(5);
	
	public GuessingGame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(jLabel);
		add(jTextfield);
		add(jButton);
		jButton.addActionListener(new myActionListener());
		pack();
		setVisible(true);
	}
	
	@Override 		
	public void actionPerformed(ActionEvent e) {
	
	}
		class myActionListener implements ActionListener{
		@Override 		
		public void actionPerformed(ActionEvent e) {
			
			String textFieldText = jTextfield.getText();
			if (Integer.parseInt(textFieldText)==randomNo) {
				jButton.setEnabled(false);
				jTextfield.setText(jTextfield.getText() + " Yes!");
				jTextfield.setEnabled(false);
			} else {
				jTextfield.setText("");
				jTextfield.requestFocus();
			}
			guesses++;
			String guessWord =	(guesses == 1) ? " guess " : " guesses";
			jLabel.setText(guesses + guessWord);
			
		}
	}
	
}
