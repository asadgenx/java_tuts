package guessinggame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class CurrencyConvertor extends JFrame implements KeyListener, ItemListener, MouseListener {
	
	private static final long serialVersionUID = 1L;
	
	JLabel label 						= new JLabel("");
	JComboBox combo 			= new JComboBox();
	JTextField textField				= new JTextField(10); // int represents size
	JLabel fromCurrencyLabel 	= new JLabel("");
	
	NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
	NumberFormat currencyUK = NumberFormat.getCurrencyInstance(Locale.UK);
	
	public CurrencyConvertor() {
		setLayout(new FlowLayout());
		add(fromCurrencyLabel);
		add(textField);
		combo.addItem("US to UK");
		combo.addItem("UK to US");
		add(label);
		add(combo);
		textField.addKeyListener(this);
		combo.addItemListener(this);
		label.addMouseListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	void setTextOnLabel() {
		String amountString = "";
		String fromCurrency = "";
		try {
				double amount =
				Double.parseDouble(textField.getText());
				if(combo.getSelectedItem().equals("US to UK")) {
					amountString = " = " +	currencyUK.format(amount * 0.61214);
					fromCurrency = "$";
				}
				if(combo.getSelectedItem().equals("UK to US"))	{
					amountString = " = " + currencyUS.format(amount * 1.63361);
					fromCurrency = "\u00A3";
				}
		} catch (NumberFormatException e) {
		}
		label.setText(amountString);
		fromCurrencyLabel.setText(fromCurrency);
	}
	@Override
	public void keyReleased(KeyEvent k) {
		setTextOnLabel();
	}
	@Override
	public void keyPressed(KeyEvent k) {
	}
	@Override
	public void keyTyped(KeyEvent k) {
	}
	@Override
	public void itemStateChanged(ItemEvent i) {
		setTextOnLabel();
	}
	@Override
	public void mouseEntered(MouseEvent m) {
		label.setForeground(Color.red);
	}
	@Override
	public void mouseExited(MouseEvent m) {
		label.setForeground(Color.black);
	}
	@Override
	public void mouseClicked(MouseEvent m) {
	}
	@Override
	public void mousePressed(MouseEvent m) {
	}
	@Override
	public void mouseReleased(MouseEvent m) {
	}
}
