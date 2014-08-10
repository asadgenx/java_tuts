package applets;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;

 class DummiesPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public void paint(Graphics myGraphics) {
		myGraphics.drawRect(300,500,500,500);
		myGraphics.setFont(new Font("Dialog", Font.BOLD, 24));
		myGraphics.drawString("Java For Dummies", 55, 100);
	}
}